package com.pixeltrice.firstSpringBootApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExternalTomcatServerApplication extends SpringBootServletInitializer 
{
	
	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder 
	   application) {
	      return application.sources(ExternalTomcatServerApplication.class);
	   }
	

	public static void main(String[] args) 
	{
		SpringApplication.run(ExternalTomcatServerApplication.class, args);
	}

}
