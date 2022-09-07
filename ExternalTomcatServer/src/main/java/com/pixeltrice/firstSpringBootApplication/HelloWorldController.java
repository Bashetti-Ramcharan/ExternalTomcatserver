package com.pixeltrice.firstSpringBootApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController 
{
	@RequestMapping("/Home")
	public String sample()
	{
		return "Greetings from Spring Boot";
	}
}
