package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypackage.loginhelper.LoginHelper;
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
		
		String error = (String)req.getAttribute("message");
		if(error!= null) {
			PrintWriter pw = resp.getWriter();
			pw.println("<html>");
			LoginHelper helper = new LoginHelper();
			pw.println("<font color = \"red\">" + error + "</font>");
			pw.println("<br>");
			helper.constructWebFormat(pw);
			
			pw.println("</html>");
			
		}
		else {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		LoginService service = new LoginService();
		boolean isAuthenticated = service.authenticate(username, password);
		if (isAuthenticated) {			
			RequestDispatcher rqd = req.getRequestDispatcher("hello.html");
			rqd.forward(req, resp);
			
		}
		else {
			
			req.setAttribute("message", "enter correct email and password");
			RequestDispatcher rqd = req.getRequestDispatcher("login");
			rqd.forward(req, resp);		
		}
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
