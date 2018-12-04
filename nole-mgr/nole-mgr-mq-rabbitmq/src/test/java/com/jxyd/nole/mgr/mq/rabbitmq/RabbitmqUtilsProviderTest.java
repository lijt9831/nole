package com.jxyd.nole.mgr.mq.rabbitmq;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.amqp.rabbit.connection.Connection;

import com.rabbitmq.client.AMQP.Queue.DeclareOk;
import com.jxyd.nole.mgr.mq.rabbitmq.RabbitmqUtils;
import com.rabbitmq.client.Channel;

public class RabbitmqUtilsProviderTest {

	@Test
	public void testSend() {
		
		Connection connection = null;
		Channel channel = null;
		try {
			RabbitmqUtils.getChannel(false);
			channel = RabbitmqUtils.getChannel(false);
			DeclareOk queueDeclare = channel.queueDeclare("zxgtestabc", true, false, false, null);
			System.out.println(queueDeclare.getMessageCount());
			System.out.println(queueDeclare.getQueue());
			
			for(int i=0;i<10001;i++) {
				channel.basicPublish("", "zxgtestabc", null, "hello".getBytes());
//				System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
			if (channel != null) {
				try {
					channel.close();
				} catch (Exception e) {
				}
			}
		}
		
	}

	@Test
	public void testDelete() {
		RabbitmqUtils.delete("abc", true, true);
	}
}
