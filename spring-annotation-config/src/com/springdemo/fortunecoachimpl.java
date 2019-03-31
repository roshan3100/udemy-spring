package com.springdemo;

import org.springframework.stereotype.Component;

@Component
public class fortunecoachimpl implements fortunecoach{

	@Override
	public String getfortune() {
		
		return "You are lucky";
	}
	

}
