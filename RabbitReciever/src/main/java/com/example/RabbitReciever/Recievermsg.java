package com.example.RabbitReciever;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;

public class Recievermsg {
	@Autowired
	
    public RestTemplate restTemplate;
	@RabbitListener(queues="#{queue1.name}")

	public void recieve1(String in) {
		recieve(in,1);
	}
	@RabbitListener(queues="#{queue2.name}")
	public void recieve2(String in) {
		recieve(in,2);
	}
	public void recieve(String in,int i) {
		if(i==1) {
			System.out.println(in+"<<>>"+i);
			Gson g= new Gson();
			SmsCommande sms=g.fromJson(in, SmsCommande.class);
			restTemplate.postForObject("http://localhost:8082/movie/subscribe", sms, String.class);
		}
		if(i==2) {
			System.out.println(in+"<<>>"+i);
			Gson g= new Gson();
			SmsCommande sms=g.fromJson(in, SmsCommande.class);
			restTemplate.postForObject("http://localhost:8083/song/subscribe", sms, String.class);
		}
	}

}
