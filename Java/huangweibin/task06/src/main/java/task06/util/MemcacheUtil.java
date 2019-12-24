package task06.util;

import com.whalin.MemCached.MemCachedClient;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import task06.pojo.Category;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.Key;
import java.util.Date;
import java.util.List;

public class MemcacheUtil {

	private static Logger logger = LogManager.getLogger(MemcacheUtil.class);
	private static String MEMCACHE_POOL_NAME = "default";
	// ClassPathXmlApplicationContext cc =new ClassPathXmlApplicationContext("spring/memcachedContext.xml");

	/**
	 * cachedClient.
	 */
	private static MemCachedClient cachedClient;


	static {
		if ( null == cachedClient) {
			cachedClient = new MemCachedClient(MEMCACHE_POOL_NAME);
		}
	}

	/**
	 * 构造函数.
	 */
	private MemcacheUtil() {
	}

	/**
	 * 向缓存添加新的键值对。如果键已经存在，则之前的值将被替换.
	 *
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @return boolean
	 */
	public static boolean set(String key, Object value) {
		return setExp(key, value, null);
	}

	/**
	 * 向缓存添加新的键值对。如果键已经存在，则之前的值将被替换.
	 *
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param expire
	 *            过期时间 New Date(1000*10)：十秒后过期
	 * @return boolean
	 */
	public static boolean set(String key, Object value, Date expire) {
		return setExp(key, value, expire);
	}

	/**
	 * 向缓存添加新的键值对。如果键已经存在，则之前的值将被替换.
	 *
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param expire
	 *            过期时间 New Date(1000*10)：十秒后过期
	 * @return boolean
	 */
	private static boolean setExp(String key, Object value, Date expire) {
		boolean flag = false;
		try {
			flag = cachedClient.set(key, value, expire);
		} catch (Exception e) {
			logger.error("Memcached set方法报错，key值：" + key + "\r\n" + exceptionWrite(e));
		}
		return flag;
	}

	/**
	 * 仅当缓存中不存在键时，add 命令才会向缓存中添加一个键值对.
	 *
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @return boolean
	 */
	public static boolean add(String key, Object value) {
		return addExp(key, value, null);
	}

	/**
	 * 仅当缓存中不存在键时，add 命令才会向缓存中添加一个键值对.
	 *
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param expire
	 *            过期时间 New Date(1000*10)：十秒后过期
	 * @return boolean
	 */
	public static boolean  add(String key, Object value, Date expire) {
		return addExp(key, value, expire);
	}

	/**
	 * 仅当缓存中不存在键时，add 命令才会向缓存中添加一个键值对.
	 *
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param expire
	 *            过期时间 New Date(1000*10)：十秒后过期
	 * @return boolean
	 */
	private static boolean addExp(String key, Object value, Date expire) {
		boolean flag = false;
		try {
			flag = cachedClient.add(key, value, expire);
		} catch (Exception e) {
			logger.error("Memcached add方法报错，key值：" + key + "\r\n" + exceptionWrite(e));
		}
		return flag;
	}

	/**
	 * 仅当键已经存在时，replace 命令才会替换缓存中的键.
	 *
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @return boolean
	 */
	public static boolean replace(String key, Object value)  {
		return replaceExp(key, value, null);
	}

	/**
	 * 仅当键已经存在时，replace 命令才会替换缓存中的键.
	 *
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param expire
	 *            过期时间 New Date(1000*10)：十秒后过期
	 * @return boolean
	 */
	public static boolean replace(String key, Object value, Date expire) {
		return replaceExp(key, value, expire);
	}

	/**
	 * 仅当键已经存在时，replace 命令才会替换缓存中的键.
	 *
	 * @param key
	 *            键
	 * @param value
	 *            值
	 * @param expire
	 *            过期时间 New Date(1000*10)：十秒后过期
	 * @return boolean
	 */
	private static boolean replaceExp(String key, Object value, Date expire) {
		boolean flag = false;
		try {
			flag = cachedClient.replace(key, value, expire);
		} catch (Exception e) {
			logger.error("Memcached replace方法报错，key值：" + key + "\r\n" + exceptionWrite(e));
		}
		return flag;
	}

	/**
	 * get 命令用于检索与之前添加的键值对相关的值.
	 *
	 * @param key
	 *            键
	 * @return boolean
	 */
	public static Object get(String key) {
		Object obj = null;
		try {
			obj = cachedClient.get(key);
		} catch (Exception e) {
			logger.error("Memcached get方法报错，key值：" + key + "\r\n" + exceptionWrite(e));
		}
		return obj;
	}

	// public static List<List> get(String key){
	//
	// }

	/**
	 * 删除 memcached 中的任何现有值.
	 *
	 * @param key
	 *            键
	 * @return boolean
	 */
	public static boolean delete(String key) {
		return cachedClient.delete(key);
	}

	/**
	 * 清理缓存中的所有键/值对.
	 *
	 * @return boolean
	 */
	public static boolean flashAll() {
		boolean flag = false;
		try {
			flag = cachedClient.flushAll();
		} catch (Exception e) {
			logger.error("Memcached flashAll方法报错\r\n" + exceptionWrite(e));
		}
		return flag;
	}

	/**
	 *
	 * @param Key 键值
	 * @return true or false
	 */
	public static boolean deleteByKey(String Key){
		return cachedClient.delete(Key);
	}

	/**
	 * 返回异常栈信息，String类型.
	 *
	 * @param e
	 *            Exception
	 * @return boolean
	 */
	private static String exceptionWrite(Exception e) {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		e.printStackTrace(pw);
		pw.flush();
		return sw.toString();
	}





}
