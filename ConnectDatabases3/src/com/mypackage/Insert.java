package com.mypackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Insert extends HttpServlet{
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection connect = null;
		String empid = req.getParameter("empid");		
		int employeeid = Integer.parseInt(empid);
		
		String sal = req.getParameter("salary");
		int salary = Integer.parseInt(sal);
		
		String name = req.getParameter("name");
		
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
			PreparedStatement st = connect.prepareStatement("insert into employeerecord(empid,name,salary) values (?,?,?)");
			st.setInt(1, employeeid);
			st.setString(2, name);
			st.setInt(3, salary);
			
			int update = st.executeUpdate();
			
			System.out.println(update + " Inserted");
			
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