package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypackage.service.LoginService;

public class hello extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		LoginService service = new LoginService();
		boolean isAuthenticated = service.authenticate(userName, passWord);
		
		PrintWriter pw = resp.getWriter();
		if(isAuthenticated) {
			
			pw.println("Username is:" + userName + "password is: " + passWord);
		}
		else {
			pw.println("enter correct username and password");
		}
	}

}
