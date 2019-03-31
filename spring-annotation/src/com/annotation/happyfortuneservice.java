package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class happyfortuneservice implements fortuneservice {

	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return "You are lucky today";
	}

}
