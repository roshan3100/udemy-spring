package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		coach basketball = context.getBean("basketballcoach",coach.class);
		System.out.println(basketball.getdailyworkout());
		System.out.println(basketball.getdailyfortune());
		
		coach track = context.getBean("trackcoach",coach.class);
		System.out.println(track.getdailyfortune());
		System.out.println(track.getdailyworkout());
		
		cricket cricket =context.getBean("cricketcoach",cricket.class);
		System.out.println(cricket.getTeam());
		System.out.println(cricket.getEmail());
		context.close();
	}

}
