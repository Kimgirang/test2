package com.zerock.guestbook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class GuestbookApplication {
	@RequestMapping("/")
	String guest(){
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(GuestbookApplication.class, args);
	}

}
