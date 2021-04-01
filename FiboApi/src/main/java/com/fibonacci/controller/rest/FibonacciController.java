package com.fibonacci.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fibonacci.model.Fibonacci;
import com.fibonacci.service.FibonacciService;

@SuppressWarnings("unused")
@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FibonacciController {
	
	@Autowired
	FibonacciService fibonacciService;

	@RequestMapping(value = "/fibonacci", method = RequestMethod.GET)
	public List<Integer> getFiboList(@RequestParam(defaultValue = "1") int number) {
		
		return fibonacciService.getFibonacciList(number);
	}

}
