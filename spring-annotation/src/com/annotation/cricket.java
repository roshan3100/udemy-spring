package com.annotation;

import org.springframework.stereotype.Component;

@Component("thatsillycoach")
public class cricket implements coach {

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "You Have done 20 mins workout";
	}

}
