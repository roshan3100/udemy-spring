package com.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:yoyo.properties")
public class cricket implements coach {
	
	@Value("${team}")
	private String team;
	
	@Value("${email}")
	private String email;
	
	private fortunecoach fortune;
	
	@Autowired
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
