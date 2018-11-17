package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypackage.service.LoginService;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		PrintWriter pw = resp.getWriter();
		pw.println("hello " + username + " your password is: "+password);
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		LoginService service = new LoginService();
		boolean isAuthenticated = service.authenticate(username, password);
		if (isAuthenticated) {
			resp.sendRedirect("hello.html");
			PrintWriter pw = resp.getWriter();
			pw.println("username: " + username + "password: " + password);
		}
		else {
			PrintWriter pw = resp.getWriter();
			pw.println("Please enter correct username and/or password");
		}
		
		
	
	
	
	
	/*@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		LoginService service = new LoginService();
		boolean isAuthenticated = service.authenticate(passWord);
		if(isAuthenticated) {
			RequestDispatcher rqd = req.getRequestDispatcher("hello.html");
			rqd.forward(req, resp);
		}
		else {
			PrintWriter pw = resp.getWriter();
			pw.println("Enter correct password");
			
		}*/
		
		
		
	}
		
	

}
