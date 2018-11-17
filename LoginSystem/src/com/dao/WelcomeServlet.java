package com.dao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.helper.LoginHelper;
import com.helper.WelcomePage;

public class WelcomeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		WelcomePage welcome = new WelcomePage();
		PrintWriter pw = resp.getWriter();
		welcome.loginDesign(pw);
	}
}
