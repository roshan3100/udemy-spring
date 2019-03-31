package com.session;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testscope {
	
	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		demo test1 = context.getBean("demo1",demo.class);
		demo test2 = context.getBean("demo1",demo.class);
		System.out.println(test1==test2);
		
		System.out.println("\nMemory location for test1: " + test1);
		System.out.println("\nMemory location for test2: " + test2 + "\n");
		
		demo test3 = context.getBean("demo2",demo.class);
		demo test4 = context.getBean("demo2",demo.class);
		System.out.println(test3==test4);
		
		System.out.println("\nMemory location for test3: " + test3);
		System.out.println("\nMemory location for test4: " + test4 + "\n");
		
		context.close();
	}
	

}
