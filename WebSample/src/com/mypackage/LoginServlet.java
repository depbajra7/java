package com.mypackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.services.LoginService;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("username");
		String passWord = req.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean isAuthenticated = loginService.authenticate(userName, passWord);
		
		if(isAuthenticated) {
			
			
			RequestDispatcher rqd = req.getRequestDispatcher("homePage.jsp");
			rqd.forward(req, resp);
		}else {
			
			req.setAttribute("message", "please enter correct username and password" );
			RequestDispatcher rqd2 = req.getRequestDispatcher("loginPage.jsp");
			rqd2.forward(req, resp);
			
			
		}
		
		
	}

}
