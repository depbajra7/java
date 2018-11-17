package com.helper;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginHelper extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		
		pw.println("<html><body>");
		pw.println("<h2>Enter your credentials to log in. </h2>");
		pw.println("<form action = \"login\">");
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
		pw.println("</body> <html>");
	}
}
