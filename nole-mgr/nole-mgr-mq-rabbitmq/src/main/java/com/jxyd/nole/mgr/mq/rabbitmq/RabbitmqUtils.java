package com.jxyd.nole.mgr.mq.rabbitmq;


import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.Connection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Consumer;

public class RabbitmqUtils {

	private static final Log log = LogFactory.getLog(RabbitmqUtils.class);

	private static CachingConnectionFactory cachingConnectionFactory;

	static {
		@SuppressWarnings("resource")
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:spring/root/private_rabbitmq.xml");
		cachingConnectionFactory = ac.getBean(CachingConnectionFactory.class);
	}

	/**
	 * @param transactional
	 * @return
	 */
	public static Channel getChannel(boolean transactional) {
		Connection connection = cachingConnectionFactory.createConnection();
		Channel channel = connection.createChannel(transactional);
		return channel;
	}
	
	/**
	 * 发送消息方法
	 * 
	 * @param queueName
	 * @param message
	 */
	public static void send(String queueName, String message) {
		Connection connection = null;
		Channel channel = null;
		try {
			connection = cachingConnectionFactory.createConnection();
			channel = connection.createChannel(false);
			channel.queueDeclare(queueName, true, false, false, null);
			channel.basicPublish("", queueName, null, message.getBytes());
			log.info("发送消息成功[" + message + "]至[" + queueName + "]");
		} catch (Exception e) {
			log.error("发送消息失败[" + message + "]至[" + queueName + "]", e);
		} finally {
			if (connection != null) {
				connection.close();
			}
			if (channel != null) {
				try {
					channel.close();
				} catch (Exception e) {
					log.error("关闭channel失败", e);
				}
			}
		}
	}
	
	/**
	 * Delete a queue
	 * 
	 * @param queueName the name of the queue
	 * @param ifUnused true if the queue should be deleted only if not in use
	 * @param ifEmpty true if the queue should be deleted only if empty
	 */
	public static void delete(String queueName ,boolean ifUnused ,boolean ifEmpty) {
		Connection connection = null;
		Channel channel = null;
		try {
			connection = cachingConnectionFactory.createConnection();
			channel = connection.createChannel(false);
			channel.queueDelete(queueName, ifUnused, ifEmpty);
			log.info("删除队列[" + queueName + "]成功");
		} catch (Exception e) {
			log.error("删除队列[" + queueName + "]失败 " + e.getCause().getMessage());
		} finally {
			if (connection != null) {
				connection.close();
			}
			if (channel != null) {
				try {
					channel.close();
				} catch (Exception e) {
					log.error("关闭channel失败", e);
				}
			}
		}
	}
	
	public static void consume(String queueName ,Consumer consumer) {
		Connection connection = null;
		Channel channel = null;
		try {
			connection = cachingConnectionFactory.createConnection();
			channel = connection.createChannel(false);
			channel.queueDeclare(queueName, true, false, false, null);
			channel.basicConsume(queueName, true, consumer);
			log.info("启动consumer成功，监听["+queueName+"]");
		} catch (Exception e) {
			log.error("启动consumer失败，监听["+queueName+"]", e);
		} finally {
			if (connection != null) {
				connection.close();
			}
			if (channel != null) {
				try {
					channel.close();
				} catch (Exception e) {
					log.error("关闭channel失败", e);
				}
			}
		}
	}
}
