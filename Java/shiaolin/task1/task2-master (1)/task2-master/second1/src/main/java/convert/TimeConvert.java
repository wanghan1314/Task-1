package convert;

import org.springframework.core.convert.converter.Converter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* spring自定义参数绑定 - string类型时间格式转换为Long类型  */
/* 这是数据从前端发送回后台Controller方法形参过程中自动转换的  */
public class TimeConvert implements Converter<String,Long> {

    /* string 类型的日期格式转换为Long类型的日期格式 */
    @Override
    public Long convert(String source){
        //定义数据格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(source);
        try {
            System.out.println("spring sucesse" + source);
            //将字符串类型转换为Data类型,
            // 然后使用getTime()获取Long类型的微秒数
            // 最后除以1000得到秒为单位的long类型数
            Long so = simpleDateFormat.parse(source).getTime()/1000;
            System.out.println(so);
            // System.out.println(simpleDateFormat.parse(source));
            return so;
        } catch (ParseException e) {
            e.printStackTrace();
            System.out.println("查询条件为空时返回所有商品信息");
        }
        //如果绑定失败返回null
        // System.out.println("null 空");
        return null;
    }
}
