package com.jxyd.nole.mgr.cache.redis;


import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

public class RedisUtils  {
	
	private static final Log log = LogFactory.getLog(RedisUtils.class);
	
	private static final String OK = "OK";
	
	private static JedisCluster jedisCluster;
	
	static {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:spring/root/private_redis.xml");
		jedisCluster = ac.getBean(JedisCluster.class);
	}
	
	public static boolean set(String key, String value) {
		long start = System.currentTimeMillis();
		boolean result = OK.equals(jedisCluster.set(key, value));
		log.debug("耗时：" + (System.currentTimeMillis() - start) + "毫秒  set(" + key + "," + value + ")");
		return result;
	}

	
	public static boolean set(String key, String value, int seconds) {
		long start = System.currentTimeMillis();
		boolean result = OK.equals(jedisCluster.setex(key, seconds, value));
		log.debug("耗时：" + (System.currentTimeMillis() - start) + "毫秒  set(" + key + "," + value + ")");
		return result;
	}

	
	public static boolean set(String key, String value, long milliseconds) {
		long start = System.currentTimeMillis();
		boolean result = OK.equals(jedisCluster.psetex(key, milliseconds, value));
		log.debug("耗时：" + (System.currentTimeMillis() - start) + "毫秒  set(" + key + "," + value + ")");
		return result;
	}

	
	public static String get(String key) {
		long start = System.currentTimeMillis();
		String result = jedisCluster.get(key);
		log.debug("耗时：" + (System.currentTimeMillis() - start) + "毫秒  get(" + key+ ")");
		return result;
	}

	
	public static boolean delete(String key) {
		long start = System.currentTimeMillis();
		boolean result = 0 < jedisCluster.del(key);
		log.debug("耗时：" + (System.currentTimeMillis() - start) + "毫秒  delete(" + key+ ")");
		return result;
	}


	
	public static boolean lock(String key, long millis) {
		log.info("尝试加锁[" + key + "]");
		while (true) { 
			// Integer reply, specifically: 1 设置成功 ,0 设置失败
			Long setnx = jedisCluster.setnx(key, String.valueOf((System.currentTimeMillis() + millis)));

			if (setnx == 1L) {// 获得锁
				log.info("已加锁[" + key + "]");
				return true;
			} else {
				String lockUntil = jedisCluster.get(key);

				if (lockUntil != null && Long.valueOf(lockUntil) < System.currentTimeMillis()) {
					log.info("清除超时锁[" + key + "]");
					delete(key);
				} else {
					try {
						log.trace("阻塞中[" + key + "]");
						Thread.sleep(50);
					} catch (Exception e) {
						// ignore
					}
				}
			}
		}
	}
 
	  /** 
	   * 解锁 
	   * @param lockKey 
	   */
	
	public static void unlock(String lockKey) {
		log.info("尝试解锁[" + lockKey + "]");
		delete(lockKey);
		log.info("已解锁[" + lockKey + "]");
	}

	
	public static boolean setList(String key, List<String> list, long milliseconds) {
		if(list == null || list.isEmpty()) {
			return false;
		}
		boolean result = true;
		for (String string : list) {
			jedisCluster.sadd(key, string);
		}
		jedisCluster.pexpire(key, milliseconds);
		return result;
	}

	
	public static List<String> getListRandom(String key ,int cnt) {
		List<String> srandmember = jedisCluster.srandmember(key, cnt);
		return srandmember;
	}

	
	public static boolean exists(String key) {
		Boolean result = jedisCluster.exists(key);
		return result;
	}

	
	public static Set<String> getAll(String key) {
		Set<String> smembers = jedisCluster.smembers(key);
		return smembers;
	}
	
	public static Set<String> keys(String pattern) {
		Set<String> keys = new TreeSet<String>();
		Map<String, JedisPool> nodes = jedisCluster.getClusterNodes();
		Collection<JedisPool> values = nodes.values();
		for (JedisPool jedisPool : values) {
			Jedis jedis = jedisPool.getResource();
			try {
				keys.addAll(jedis.keys(pattern));
			} catch (Exception e) {
				log.error("获取keys失败",e);
			} finally {
				if(jedis != null)
					jedis.close();
			}
		}
		return keys;
	}
	  
}
