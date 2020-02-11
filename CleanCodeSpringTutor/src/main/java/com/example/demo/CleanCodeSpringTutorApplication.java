package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import code.clean.system.example3.ServiceController;

@SpringBootApplication
@ComponentScan(basePackages = "code.clean.system.example3")
public class CleanCodeSpringTutorApplication implements CommandLineRunner {
	private static final Logger logger = Logger.getGlobal();
	@Autowired
	private ServiceController controller;
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(CleanCodeSpringTutorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		controller.doAction();
		logger.info("End of Main");
		
	}
}