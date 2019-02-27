package com.example.Rabbit;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.connection.RoutingConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class Sendermsg {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	@Autowired
	private TopicExchange topicExchange;
	
	public void sendmsg(String routingKey , String msg) {
		rabbitTemplate.convertAndSend(topicExchange.getName(),routingKey,msg);
		
	}
	

}
