package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JavaTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaTestApplication.class, args);

		String s = "  abc  def\t";
		s = s.strip();
		System.out.println(s);
		
		String s1 = "  abc  def\t";
		s1 = s1.trim();
		System.out.println(s1);
	}
}

@RestController
class TestController {

	@GetMapping("/test")
	public String getHello() {
		return "Hello World !";
	}
}
