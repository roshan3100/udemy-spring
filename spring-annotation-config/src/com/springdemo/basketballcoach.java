package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class basketballcoach implements coach{
	
	private fortunecoach fortune;

	@Autowired
	public basketballcoach(fortunecoach fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "You Worked out 20 minutes";
	}
	
	public String getdailyfortune()
	{
		return fortune.getfortune();
	}

}
