package com.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {
	 private static final Logger logger = LoggerFactory.getLogger(CalculatorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	    logger.debug("just a test info log");

	}

}
