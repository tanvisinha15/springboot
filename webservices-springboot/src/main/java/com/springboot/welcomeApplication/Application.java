package com.springboot.welcomeApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.springboot")
public class Application {
	public static void main(String[] args){
		ApplicationContext ctx= SpringApplication.run(Application.class, args);
	}

}
