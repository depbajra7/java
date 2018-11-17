package com.mypackage;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Program {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		JdbcTemplate tmp= (JdbcTemplate) context.getBean("template"); 
		String sql = "update employee set salary=6500 where id=101";
		tmp.update(sql);
		System.out.println("Changes made");
	
		

	}
	
	

}
