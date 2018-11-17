package com.mypackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mypackage.dao.HelloDAO;

@Service
public class HelloService {
	
	@Autowired
	private HelloDAO hellodao;
	
	public String sayHello() {
		String message = hellodao.sayHello();
		return  message;
	}

}
