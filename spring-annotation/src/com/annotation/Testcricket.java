package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcricket {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		coach thecoach = context.getBean("thatsillycoach",coach.class);
		
		System.out.println(thecoach.getdailyworkout());
		context.close();
	}

}
