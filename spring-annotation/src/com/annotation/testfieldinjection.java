package com.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testfieldinjection {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("applicationContext.xml");

		autowire field = context.getBean("fieldinjection",autowire.class);

		System.out.println(field.getfortune());
		System.out.println(field.getname());
		context.close();
	}



}
