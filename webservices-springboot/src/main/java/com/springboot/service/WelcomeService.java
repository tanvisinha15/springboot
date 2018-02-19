package com.springboot.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
	public String retrieveWelcomMessage(){
		return "Hi!! Welcome to IRIS!!";
	}

}
