package com.fiborest.rest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.fibonacci.service.FibonacciService;

@TestInstance(Lifecycle.PER_CLASS)
class FiboRestApplicationTests {
	
    private FibonacciService fibonacciService;

	@BeforeAll
    public void setUp() {
		fibonacciService = new FibonacciService();
    }


    @Test
    public void Given_Fibonacci_When_Number_Is_0_Then_List_Size_1() {
        int testIndex = 0;
        int expectedResult = 2;
        
        List<Integer> f = fibonacciService.getFibonacciList(testIndex);
		assertEquals(expectedResult, f.size());
    }

}
