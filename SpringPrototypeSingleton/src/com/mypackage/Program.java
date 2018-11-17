package com.mypackage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Employee e = (Employee)context.getBean("emp"); /*in [scope = "prototype"] object of employee 
		is created and dependencies are injected only when this code is written (container is called). 
		else object is created and dependencies are injected when ApplicationContext level*/
		
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getAddress().getState());
	
		

	}
	
	

}
