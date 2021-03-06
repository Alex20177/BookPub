package com.example.bookpub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookPubApplication {
	
	@Bean
	public StartupRunner schedulerRunner() {
		return new StartupRunner();
	}//Close schedulerRunner method.

	public static void main(String[] args) {
		SpringApplication.run(BookPubApplication.class, args);
	}//Close main method.

}//Close BookPubApplication class.
