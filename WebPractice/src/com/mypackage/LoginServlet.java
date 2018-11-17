package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mypackage.LoginHelper.LoginHelper;
import com.mypackage.LoginService.LoginService;

public class LoginServlet extends HttpServlet {

	
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String errorMessage = (String)req.getAttribute("message");
		
		if(errorMessage!= null) {
		
		LoginHelper helper = new LoginHelper();
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("<font color = \"red\">" + errorMessage + "</font>");
		pw.println("<br>");
		helper.constructWebFormat(pw);
		pw.println("</html>");
		}
		
		
		else {
				
		String passWord = req.getParameter("password");
		LoginService service = new LoginService();
		boolean isAuthenticated = service.authenticate(passWord);
		
		if(isAuthenticated) {
			
			resp.sendRedirect("home.html");
			
		}
		else {
			req.setAttribute("message", "Please enter correct username and password" );
			RequestDispatcher rqd = req.getRequestDispatcher("login");
			rqd.forward(req, resp);
		}
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		pw.println("inside doGet of LoginServlet");
	}
}
