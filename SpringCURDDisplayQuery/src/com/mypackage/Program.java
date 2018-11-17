package com.mypackage;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Program {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		JdbcTemplate tmp = (JdbcTemplate) context.getBean("template");
		String sql = "select * from employee";
		List<Employee> list = tmp.query(sql, new EmployeeMapper());

		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i).getId()+ " ");
			System.out.print(list.get(i).getName()+ " ");
			System.out.print(list.get(i).getSalary()+ " ");
			System.out.print(list.get(i).getGender()+ " ");
			System.out.println();
			
		}
		System.out.println("Changes made");

	}

}

