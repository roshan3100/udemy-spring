package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class fieldinjection implements autowire {
	
	@Autowired
	@Qualifier("happyfortuneservice")
	fortuneservice fortune;

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return fortune.getfortune();
	}

	



}
