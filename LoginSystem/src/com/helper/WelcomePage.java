package com.helper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomePage{

		public void loginDesign(PrintWriter pw) {		
					
			pw.println("<br>");
			pw.println("<h2>Enter your credentials to log in. </h2>");
			pw.println("<form action = \"login\" method = \"get\">");
			pw.println("<table>");
			pw.println("<tr>");
			pw.println("<td>User Name: </td>");
			pw.println("<td> <input type = \"text\" name = \"username\"></td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td>Password: </td>");
			pw.println("<td><input type = \"password\" name = \"password\"></td>");
			pw.println("</tr>");
			pw.println("<tr>");
			pw.println("<td></td>");
			pw.println("<td> <input type = \"submit\" value = \"login\"> </td>");
			pw.println("</tr>");
			pw.println("</table></form>");
			
	}

}
