package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.WelcomePage;
import com.services.LoginService;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter pw = resp.getWriter();
		String errorMessage = (String) req.getAttribute("message");
		if (errorMessage != null) {
			WelcomePage display = new WelcomePage();

			pw.println("<html>");
			pw.println("<body");
			pw.println(errorMessage);
			display.loginDesign(pw);
			pw.println("</body>");
			pw.println("</html>");

		} else {

			String userName = req.getParameter("username");
			String passWord = req.getParameter("password");

			LoginService obj = new LoginService();
			boolean isAuthenticated = obj.authenticate(userName, passWord);

			if (isAuthenticated) {
				resp.sendRedirect("home.html");
			} else {

				req.setAttribute("message", "enter correct username and password");
				resp.sendRedirect("login");

			}
		}
	}
}
