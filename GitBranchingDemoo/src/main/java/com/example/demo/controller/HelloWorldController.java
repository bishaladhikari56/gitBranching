package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	@RequestMapping("/")
	public String hello() {
		//Just a test method
		String demo="hello";
		System.out.println("hello world");
		return "Hello javaTpoint";
	}
}