package com.mypackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mypackage.service.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	private HelloService service;
	
	@RequestMapping("/hello")
	public String sayHello(Model model) {
		String message = service.sayHello();
		model.addAttribute("welcomemessage", message);
		return "hello there";
	}
	
	
}
