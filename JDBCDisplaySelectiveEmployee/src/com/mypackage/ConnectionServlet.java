package com.mypackage;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
		String empid = req.getParameter("empid");
		int employeeid = Integer.parseInt(empid);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "system");
			PreparedStatement st = conn.prepareStatement("select name, salary from employeerecord where empid=:employeeid");
			st.setInt(1, employeeid);
			ResultSet rset = st.executeQuery();
			
			Employee emp = new Employee();
			
			List <Employee> list = new ArrayList<Employee>();
			
			while(rset.next()) {
				String empname = rset.getString("name");
				int empsalary = rset.getInt("salary");
				
				emp.setName(empname);
				emp.setSalary(empsalary);
				list.add(emp);
			}
			PrintWriter pw = resp.getWriter();
			pw.println("<html>");
			pw.println("<body>");
			
			
			for (int i = 0; i < list.size(); i++) {
				Employee detail = list.get(i);
				pw.print(detail.getName() + " ");
				pw.println(detail.getSalary());
			}
			
			
			pw.println("</body>");			
			pw.println("</html>");
			
			
		} catch (Exception e) {
			System.out.println("exception caught");
			e.printStackTrace();
		}
		
		
	}
}
