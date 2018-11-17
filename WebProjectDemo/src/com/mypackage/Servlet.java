package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
	
		System.out.println("Inside doGet of Servlet");
		
		
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");
		pw.println("Welcome to the website. ");
		pw.println("<html>");
		pw.println("<body>");
		pw.println("<input type = \"text\" name = \"name1\">");
		pw.println("hello");
		
		
		pw.println("<br>");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		if (username.equals("dep")){
		pw.println("Hello " + username + ", " + "the password you entered is: "+ password);
		}
		else {
			pw.println("Please enter correct username and password");
		}
		
		pw.println("</body>");
		pw.println("</html>");
	}
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException {
		
		System.out.println("Inside doPost of Servlet");
	}
}



