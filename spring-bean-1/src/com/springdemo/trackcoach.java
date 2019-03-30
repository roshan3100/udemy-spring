package com.springdemo;

public class trackcoach implements coach{
	
	private fortunecoach fortune;
	public trackcoach()
	{
		System.out.println("No-arg");
	}

	public fortunecoach getFortune() {
		return fortune;
	}

	public void setFortune(fortunecoach fortune) {
		this.fortune = fortune;
	}

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "You worked out 10 minutes";
	}

	@Override
	public String getdailyfortune() {
		// TODO Auto-generated method stub
		return fortune.getfortune();
	}

}
