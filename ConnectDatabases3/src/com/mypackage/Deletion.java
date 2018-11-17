package com.mypackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Deletion extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String empid = req.getParameter("empid");
		Connection connect = null;
		int employeeid = Integer.parseInt(empid);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
			PreparedStatement st = connect.prepareStatement("delete from employeerecord where empid= :employeeid");
			st.setInt(1, employeeid);
			int update = st.executeUpdate();
			System.out.println(update + " deleted");
			
		}
		
		catch (Exception e) {
			System.out.println("Exception placed");
			System.out.println(e);
		}
		
		finally {
			try {
				
				connect.close();
				System.out.println("Connection closed");
			}
			catch (Exception e) {
			System.out.println("Connection disclosed");
		}
		
	}
	
	

}
}