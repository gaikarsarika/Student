package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);
		
		Addition addition=new Addition();
		
		int sum = addition.sum(10, 10);
		
		System.out.println("This is addition logic by the other service" +sum);
	}

}
