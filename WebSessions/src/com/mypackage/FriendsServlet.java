package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mypackage.LoginService.FriendsService;

public class FriendsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FriendsService service = new FriendsService();
		
		HttpSession session = req.getSession();
		String userName =(String)session.getAttribute("username");
		PrintWriter pw = resp.getWriter();
		service.displayFriends(userName, pw);
		
		
	}
}
