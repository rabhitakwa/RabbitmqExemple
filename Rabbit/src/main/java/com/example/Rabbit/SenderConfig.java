package com.example.Rabbit;

import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SenderConfig {
	
@Bean	
public TopicExchange exchange() {
	return new TopicExchange("nntutorial.exchange");
	
}


@Bean	
public Sendermsg sendmsg() {
	return new Sendermsg();
	
}

}
