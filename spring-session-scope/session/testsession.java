package com.session;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testsession {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("session.xml");
		
		session ses = context.getBean("demo",session.class);
		System.out.println(ses.roshan());
		context.close();
		
		
	}

}
