package com.btk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MonProjetSpring11LoggingApplication {

	@Autowired
	private static Logger logger = LoggerFactory.getLogger(MonProjetSpring11LoggingApplication.class);
	
	
	public static void main(String[] args) {
		SpringApplication.run(MonProjetSpring11LoggingApplication.class, args);
	}
	
	
	@Bean
	public CommandLineRunner runIt() {
		return args -> {
			//FATAL > ERROR > WARN >INFO > DEBUG > TRACE 
			logger.info("voici mon message d'info");
			
		};
	}
}
