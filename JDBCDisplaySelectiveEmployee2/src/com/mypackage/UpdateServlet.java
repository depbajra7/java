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

public class UpdateServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn = null;
		String empid = req.getParameter("empid");
		int employeeid = Integer.parseInt(empid);
		
		String salary = req.getParameter("newsalary");
		int newsalary = Integer.parseInt(salary);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
			PreparedStatement st = conn.prepareStatement("update employeerecord set salary=:newsalary where empid=:employeeid");
			st.setInt(1, newsalary);
			st.setInt(2, employeeid);
			int update = st.executeUpdate();
			System.out.println(update + " row updated");
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
