package com.annotation;

import org.springframework.stereotype.Component;

@Component
public class tennis implements coach {

	@Override
	public String getdailyworkout() {
		// TODO Auto-generated method stub
		return "Tenis 30 mins workout";
	}

}
