package com.mypackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn = null;
		String empid = req.getParameter("empid");
		int employeeid = Integer.parseInt(empid);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
			PreparedStatement st = conn.prepareStatement("delete from employeerecord where empid=:employeeid");
			st.setInt(1, employeeid);
			int update = st.executeUpdate();
			System.out.println(update + " rows deleted");
		}
		catch(Exception e){
			System.out.println("Exception caught");
			System.out.println(e);
		}
		finally {
			try {
				conn.close();
				System.out.println("connection closed");
			} catch (SQLException e) {
				System.out.println("connection not closed");
				e.printStackTrace();
			}
		}
		
		
	}
}
