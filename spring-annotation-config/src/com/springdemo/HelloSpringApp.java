package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(app.class);
		coach basketball = context.getBean("basketballcoach",coach.class);
		System.out.println(basketball.getdailyworkout());
		System.out.println(basketball.getdailyfortune());
		
		coach trackcoach = context.getBean("trackcoach",coach.class);
		System.out.println(trackcoach.getdailyfortune());
		System.out.println(trackcoach.getdailyworkout());
		
		cricket cricket =context.getBean("cricket",cricket.class);
		System.out.println(cricket.getTeam());
		System.out.println(cricket.getEmail());
		context.close();
	}

}
