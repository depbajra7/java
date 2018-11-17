package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ConnectionServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Connection conn = null;
		String empid = req.getParameter("empid");
		int employeeid = Integer.parseInt(empid);

		String empname = req.getParameter("empname");
		String salary = req.getParameter("empsalary");
		int empsalary = Integer.parseInt(salary);
		String empgender = req.getParameter("gender");

		String address = req.getParameter("empaddress");
		int empaddress = Integer.parseInt(address);

		String age = req.getParameter("empage");
		int empage = Integer.parseInt(age);

		String vid = req.getParameter("empvid");
		int empvid = Integer.parseInt(vid);

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
			PreparedStatement st = conn.prepareStatement("insert into employeerecord values(?,?,?,?,?,?,?)");
			st.setInt(1, employeeid);
			st.setString(2, empname);
			st.setInt(3, empsalary);
			st.setString(4, empgender);
			st.setInt(5, empaddress);
			st.setInt(6, empage);
			st.setInt(7, empvid);

			int update = st.executeUpdate();
			System.out.println(update);

		} catch (Exception e) {
			System.out.println("exception caught");
			e.printStackTrace();
		} finally {
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
