package com.zhangheng.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;


@Component
@RabbitListener(queues = "hello")
public class ReceiveMQ {
	
	@RabbitHandler
	public void receive(String str) {
		System.out.println("Receiver  : " + str);
	}
}
