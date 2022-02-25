package com.aadiminnovation.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.aadiminnovation.user.entity.*;
import com.aadiminnovation.user.repository.*;

@SpringBootApplication
public class UserServiceApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	
	
}