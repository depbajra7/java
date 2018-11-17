package com.mypackage.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;

import com.mypackage.service.LoginService;






@WebServlet(urlPatterns="/login")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		LoginService service = new LoginService();
		boolean isAuthenticated = service.isAuthenticated(username, password);
		
		if(isAuthenticated) {
			req.setAttribute("username", username);
			RequestDispatcher rqd = req.getRequestDispatcher("home.jsp");
			rqd.forward(req, resp);
		}
		
		
		
	}

}
