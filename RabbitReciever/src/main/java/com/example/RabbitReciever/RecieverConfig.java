package com.example.RabbitReciever;

import org.springframework.amqp.core.AnonymousQueue;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RecieverConfig {
	@Bean	
	public TopicExchange exchange() {
		return new TopicExchange("nntutorial.exchange");
		
	}
	@Bean
	public Queue queue1() {
		return new AnonymousQueue();
		
	}
	@Bean
	public Queue queue2() {
		return new AnonymousQueue();
		
	}
	@Bean
	public Binding binding1() {
		return BindingBuilder.bind(queue1()).to(exchange()).with("*.movie.*");
		
	}
	@Bean
	public Binding binding2() {
		return BindingBuilder.bind(queue2()).to(exchange()).with("*.song.*");
		
	}
	@Bean
	public Recievermsg recievermsg () {
		return new Recievermsg(); 
		
		
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
