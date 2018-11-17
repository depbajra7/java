package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HomeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
		String userName = (String)session.getAttribute("username");
		
		
		PrintWriter pw = resp.getWriter();
		pw.println("<html>");
		pw.println("Hello " + userName + " welcome to the home page");
		pw.println("<form action = \"logout\" >" );
		pw.println("<a href = \"friends?username = " + userName + "\">Friends</a> <br><br>" );
		
		pw.println("<input type = \"submit\" value = \"logout\"> ");
		
		
		String domain = this.getServletContext().getInitParameter("domain");
		String email = this.getServletConfig().getInitParameter("email");
		pw.println("<html>");
		pw.println("<h3>" + domain + "</h3>");
		pw.println("<h3>" + email + "</h3>" );
		pw.println("</html>");
		
		
	}
	
}
