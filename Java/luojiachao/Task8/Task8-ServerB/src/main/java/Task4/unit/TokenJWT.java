package Task4.unit;

import Task4.pojo.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;



import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import net.minidev.json.JSONObject;

import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.JOSEObjectType;
import com.nimbusds.jose.JWSAlgorithm;
import com.nimbusds.jose.JWSHeader;
import com.nimbusds.jose.JWSObject;
import com.nimbusds.jose.JWSVerifier;
import com.nimbusds.jose.Payload;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
public class TokenJWT {
    /**
     *  公用密钥，保存在服务器端，客户端是不会知道密钥的，以防被攻击
     */
    public static String SECRET = "LJCZB";

    /**
     31      * 初始化head部分的数据为
     32      * {
     33      *         "alg":"HS256",
     34      *         "type":"JWT"
     35      * }
     36      */
    private static final JWSHeader header=new JWSHeader(JWSAlgorithm.HS256, JOSEObjectType.JWT,
    null, null, null, null, null,
            null, null, null,
            null, null, null);

    /**
     * 生成token
     * @param
     * @return
     * @throws Exception
     */
    public static String createToken(User user) throws Exception{
        //签发时间
        Date date = new Date();

        //过期时间 30分钟过期
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.MINUTE,30);
        Date expireDate = nowTime.getTime();

        Map<String, Object> map = new HashMap<>();
        //声明类型，这里是jwt
        map.put("typ","JWT");
        //声明加密的算法 通常直接使用 HMAC SHA256
        map.put("alg","HS256");
        //创建一个token
        String token = JWT.create()
                .withHeader(map)
                .withClaim("username",user.getUsername())//用户ID
                .withExpiresAt(expireDate)//过期时间
                .withIssuedAt(date)//签发时间
                .sign(Algorithm.HMAC256(SECRET));//加密
        return token;
    }

    /**
     * 生成token，该方法只在用户登录成功后调用
     *
     * @param payload Map集合，可以存储用户id，token生成时间，token过期时间等自定义字段
     * @return token字符串,若失败则返回null
     */
    public static String createToken(Map<String, Object> payload) {
        String tokenString = null;
        // 创建一个 JWS object
        JWSObject jwsObject = new JWSObject(header, new Payload(new JSONObject(payload)));
        try {
            // 将jwsObject 进行HMAC签名
            jwsObject.sign(new MACSigner(SECRET));
            tokenString=jwsObject.serialize();
        } catch (JOSEException e) {
            System.err.println("签名失败:" + e.getMessage());
            e.printStackTrace();
        }
        return tokenString;
    }
    /**
     * 用于邮箱验证的Token
     * @param emailToken
     * @return
     * @throws Exception
     */
    public static String emailToken(String emailToken) throws UnsupportedEncodingException {
        //签发时间
        Date date = new Date();

        //过期时间 15分钟过期
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.MINUTE, 15);
        Date expireDate = nowTime.getTime();

        Map<String, Object> map = new HashMap<>();
        map.put("typ", "JWT");
        map.put("alg", "KS256");

        String token = JWT.create()
                .withHeader(map)
                .withClaim("token", emailToken)
                .withIssuedAt(date)//签发时间
                .withExpiresAt(expireDate)//过期时间
                .sign(Algorithm.HMAC256(SECRET));//加密
        return token;
    }
    /**
     * 校验token是否合法，返回Map集合,集合中主要包含  state状态码   data鉴权成功后从token中提取的数据
     * 该方法在过滤器中调用，每次请求API时都校验
     * @param token
     * @return  Map<String, Object>
     */
    public static Map<String, Object> validToken(String token) {
        Map<String, Object> resultMap = new HashMap<>();
        try {
            JWSObject jwsObject = JWSObject.parse(token);
            Payload payload = jwsObject.getPayload();
            JWSVerifier verifier = new MACVerifier(SECRET);

            if (jwsObject.verify(verifier)) {
                JSONObject jsonOBj = payload.toJSONObject();
                // token校验成功（此时没有校验是否过期）
                resultMap.put("state", TokenState.VALID.toString());
                // 若payload包含ext字段，则校验是否过期
                if (jsonOBj.containsKey("ext")) {
                    long extTime = Long.valueOf(jsonOBj.get("ext").toString());
                    long curTime = new Date().getTime();
                    // 过期了
                    if (curTime > extTime) {
                        resultMap.clear();
                        resultMap.put("state", TokenState.EXPIRED.toString());
                    }
                }
                resultMap.put("data", jsonOBj);

            } else {
                // 校验失败
                resultMap.put("state", TokenState.INVALID.toString());
            }

        } catch (Exception e) {
            //e.printStackTrace();
            // token格式不合法导致的异常
            resultMap.clear();
            resultMap.put("state", TokenState.INVALID.toString());
        }
        return resultMap;
    }
    /**
     * 解密token
     * @param token
     * @return
     * @throws Exception
     */
    public static Map<String,Claim> verifyToken(String token) throws Exception{
        //验证 verifier
        JWTVerifier verifier = JWT.require(Algorithm.HMAC256(SECRET)).build();
        DecodedJWT jwt;
        try {
            jwt = verifier.verify(token);
        }catch (Exception e){
            throw new RuntimeException("登录凭证已经失效，请重新登录！");
        }
        return jwt.getClaims();
    }


}

