package com.example.Rabbit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

@RestController
@RequestMapping("/sender")
public class SenderController {
	@Autowired
	private Sendermsg sendermsg;   
	
	@PostMapping("/send")
	public String send(@RequestBody SmsCommande sms) {
		
		Gson g = new Gson();
		String reqJson=g.toJson(sms);
		sendermsg.sendmsg("key."+sms.getRoute()+".rabbitmq", reqJson);
		return "success";
	}

}
