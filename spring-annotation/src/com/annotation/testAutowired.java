package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAutowired {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		autowire wr = context.getBean("autowiredd",autowire.class);
		
		System.out.println(wr.getname());
		System.out.println(wr.getfortune());
		
		context.close();
		
	}
}
