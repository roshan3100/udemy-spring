package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testsetterinjection {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");
		
		autowire setter = context.getBean("setterinjection",autowire.class);
		
		System.out.println(setter.getfortune());
		System.out.println(setter.getname());
		context.close();
	}

}
