package com.springdemo;

public class cricket implements coach {
	
	private String team;
	private String email;
	private fortunecoach fortune;
	public cricket(fortunecoach fortune) {
		super();
		this.fortune = fortune;
	}

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "Cricket 20mins workout";
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String getdailyfortune() {
		// TODO Auto-generated method stub
		return "cricket "+fortune.getfortune();
	}

}
