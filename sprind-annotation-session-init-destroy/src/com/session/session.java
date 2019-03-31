package com.session;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class session implements demo{

	@Override
	public String roshan() {
		// TODO Auto-generated method stub
		return "Roshan";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("Start");
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("Destroy");
	}

}
