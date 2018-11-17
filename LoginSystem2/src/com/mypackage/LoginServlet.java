package com.mypackage;
import java.io.IOException;
import java.io.PrintWriter;
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
		
		LoginService obj = new LoginService();
		boolean isAuthenticated = obj.authenticate(userName, passWord);
		
		if(isAuthenticated ) {
			resp.sendRedirect("home.html");
		}else {
			PrintWriter pw = resp.getWriter();
			pw.println("Enter correct username and password");
		}		
	}
}
