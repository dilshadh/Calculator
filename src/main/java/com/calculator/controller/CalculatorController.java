package com.calculator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;



@RestController
@Slf4j
public class CalculatorController {
	
	@GetMapping("/sum/{a}/{b}")
	public int getSum(@PathVariable int a, @PathVariable int b) {
		int sum = a+b;
		log.info("Inside getsum method, returning sum "+ sum);
		return sum;
	}

}
