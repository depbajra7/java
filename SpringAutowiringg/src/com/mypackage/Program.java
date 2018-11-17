package com.mypackage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee e = (Employee)context.getBean("emp");
		
		System.out.println(e.getName());
		System.out.println(e.getAddress().getState());
		
		
	
		
	
	
		

	}
	
	

}
