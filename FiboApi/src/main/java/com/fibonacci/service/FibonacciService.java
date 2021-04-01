package com.fibonacci.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class FibonacciService {

	private int n1=0,n2=1,n3=0;    

	public List<Integer> getFibonacciList(int number)
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(n2);
		fillFibonacciList(list, number);
		
		return list;
	}
	
	private void fillFibonacciList(List<Integer> list, int number){     
		if(number>=0){    
	         n3 = n1 + n2;    
	         n1 = n2;    
	         n2 = n3;    
	         list.add(n3);
	         fillFibonacciList(list, number-1);    
	     }    
}
}
