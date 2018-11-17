package com.mypackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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

public class ServletConnect extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		java.sql.Connection connt = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connt = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
			Statement stmt = connt.createStatement();
			ResultSet reset = stmt.executeQuery("select * from employeerecord");

			List<DetailsOfEmployee> list1 = new ArrayList<DetailsOfEmployee>();

			while (reset.next()) {

				int empid = reset.getInt("empid");
				int salary = reset.getInt("salary");
				int age = reset.getInt("age");
				String name = reset.getString("name");
				int vid = reset.getInt("vid");
				int addressid = reset.getInt("addressid");
				String gender = reset.getString("gender");

				DetailsOfEmployee employeedetails = new DetailsOfEmployee();

				employeedetails.setAddressid(addressid);
				employeedetails.setAge(age);
				employeedetails.setEmpid(empid);
				employeedetails.setName(name);
				employeedetails.setGender(gender);
				employeedetails.setSalary(salary);
				employeedetails.setVid(vid);

				list1.add(employeedetails);
			}

			PrintWriter pw = resp.getWriter();

			pw.println("<html>");
			pw.println("<body>");
			pw.println("<table border = \"1\">");
			pw.println("<tr>");
			pw.println(
					"<th> Employee ID </th> <th> employee name</th><th>salary</th><th>gender</th><th> age</th> <th>address id </th> <th> vid</th>");

			for (int i = 0; i < list1.size(); i++) {
				DetailsOfEmployee empdetails = list1.get(i);
				pw.println("<tr>");
				pw.println("<td>" + empdetails.getEmpid() + "</td>");
				pw.println("<td>" + empdetails.getName() + "</td>");
				pw.println("<td>" + empdetails.getSalary() + "</td>");
				pw.println("<td>" + empdetails.getGender() + "</td>");
				pw.println("<td>" + empdetails.getAge() + "</td>");
				pw.println("<td>" + empdetails.getAddressid() + "</td>");
				pw.println("<td>" + empdetails.getVid() + "</td>");
				pw.println("</tr>");
			}
			pw.println("</table>");
			pw.println("</body>");
			pw.println("</html>");
		} catch (Exception e) {
			System.out.println(e);
		}

		finally {

			try {
				connt.close();
				System.out.println("connection closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				System.out.println("connection not closed");
			}
		}

	}

}
