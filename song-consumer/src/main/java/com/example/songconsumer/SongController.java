package com.example.songconsumer;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/song")
public class SongController {
	@RequestMapping(value="/subscribe",method=RequestMethod.POST)
	public String subscribe(@RequestBody SmsCommande sms) {
		
		System.out.println(sms.getMobileno()+":you are succeflly subscribed  for"+sms.getRoute());
		return  sms.getMobileno()+":you are succeflly subscribed  for"+sms.getRoute();
	}

}
