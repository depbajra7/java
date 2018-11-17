package com.mypackage.dao;

import org.springframework.stereotype.Repository;

@Repository
public class HelloDAO {

	public String sayHello() {
		return "Welcome to the website";
				
	}
}
