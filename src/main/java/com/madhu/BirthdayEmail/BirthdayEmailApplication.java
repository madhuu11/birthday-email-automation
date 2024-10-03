package com.madhu.BirthdayEmail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//enable the scheduling
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class BirthdayEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(BirthdayEmailApplication.class, args);
	}

}
