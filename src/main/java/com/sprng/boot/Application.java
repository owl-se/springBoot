package com.sprng.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Application {

	@Autowired
	private static User user;

	@Value("${fruits}")
	private List<String> path;

	@Value("${timeout: 30}")
	private int timeout;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("sa");
		//user.printDetails();

	}

	public void runMe() {
		System.out.println(this.path);
	}
}
