package com.wzsuper.jersey.services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

/**
 * 消息队列消费者
 * 1、需在rabbitMQ.xml中指定消息队列
 * 配置示例：
 * <rabbit:listener-container connection-factory="connectionFactory">
             <rabbit:listener queues="logQueue"  ref="messageReceiver"/>
   </rabbit:listener-container>
 * @author wangzhen
 */
public class LogMessageConsumer implements MessageListener {
	
	private Logger logger = LoggerFactory.getLogger(LogMessageConsumer.class);

	@Override
	public void onMessage(Message message) {

		logger.info("receive message:{}",message);
	}

}