package com.jxyd.nole.mgr.mq.rabbitmq;

import java.io.IOException;

import org.junit.Test;

import com.jxyd.nole.bas.log.Log;
import com.jxyd.nole.bas.log.LogFactory;
import com.jxyd.nole.mgr.mq.rabbitmq.RabbitmqUtils;
import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Consumer;
import com.rabbitmq.client.DefaultConsumer;
import com.rabbitmq.client.Envelope;

public class RabbitmqUtilsConsumerTest {

	private static final Log log = LogFactory.getLog(RabbitmqUtilsConsumerTest.class);
	
	public static void main(String[] args) {
		Channel channel = RabbitmqUtils.getChannel(false);
		Consumer consumer = new DefaultConsumer(channel) {
			@Override
			public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
					byte[] body) throws IOException {
				String message = new String(body, "UTF-8");
				log.info("从[" + envelope.getRoutingKey() + "]获取，consumerTag:" + consumerTag);
				long start = System.currentTimeMillis();
				try {
					log.info("处理数据["+message+"]成功,耗时：" + (System.currentTimeMillis() - start) + "毫秒");
				}catch(Exception e) {
					log.error("处理数据["+message+"]失败",e);
				}
			}
		};
		
		RabbitmqUtils.consume("zxgtestabc", consumer);
		
	}

}
