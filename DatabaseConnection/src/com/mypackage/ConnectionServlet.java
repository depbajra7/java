package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
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
		java.sql.Connection conn = null;
		
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
		Statement st = conn.createStatement();
		ResultSet rset = st.executeQuery("select * from employeerecord");

		
		List<EmployeeDetails> list1 = new ArrayList<EmployeeDetails>();

		while (rset.next()) {
		
			EmployeeDetails empdetails = new EmployeeDetails();
			int empid = rset.getInt("empid");
			String name = rset.getString("name");
			int salary = rset.getInt("salary");
			String gender = rset.getString("gender");
			int addressid = rset.getInt("addressid");
			int age = rset.getInt("age");
			int vid = rset.getInt("vid");
			
			
			empdetails.setEmpid(empid);
			empdetails.setName(name);
			empdetails.setSalary(salary);
			empdetails.setGender(gender);
			empdetails.setAge(age);
			empdetails.setAddressid(addressid);
			empdetails.setVid(vid);

			list1.add(empdetails);
		}
		PrintWriter pw = resp.getWriter();

		pw.println("<html>");
		pw.println("<body>");
		pw.println("<table border = \"1\">");
		pw.println("<tr>");
		pw.println(
				"<th> Employee ID </th> <th> employee name</th><th>salary</th><th>gender</th><th> age</th> <th>address id </th> <th> vid</th>");

		for (int i = 0; i < list1.size(); i++) {
			EmployeeDetails details = list1.get(i);
			pw.println("<tr>");
			pw.println("<td>" + details.getEmpid() + "</td>");
			pw.println("<td>" + details.getName() + "</td>");
			pw.println("<td>" + details.getSalary() + "</td>");
			pw.println("<td>" + details.getGender() + "</td>");
			pw.println("<td>" + details.getAge() + "</td>");
			pw.println("<td>" + details.getAddressid() + "</td>");
			pw.println("<td>" + details.getVid() + "</td>");
			pw.println("</tr>");

		}

		pw.println("</table>");
		pw.println("</body>");
		pw.println("</html>");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				
				System.out.println("connection  not closed");
			}
		}

	}

}
