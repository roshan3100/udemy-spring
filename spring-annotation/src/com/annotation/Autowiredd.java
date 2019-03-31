package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Autowiredd implements autowire{

	private fortuneservice fortune;
	
	@Autowired
	
	public Autowiredd( @Qualifier("fortuneserviceimp")fortuneservice fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getname() {
		// TODO Auto-generated method stub
		return "Autowired";
	}

	@Override
	public String getfortune() {
		// TODO Auto-generated method stub
		return fortune.getfortune();
	}
	

}
