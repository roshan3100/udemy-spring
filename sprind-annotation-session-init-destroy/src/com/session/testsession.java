package com.session;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testsession {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("session.xml");
		
		session ses = context.getBean("session",session.class);
		System.out.println(ses.roshan());
		context.close();
		
		
	}

}
