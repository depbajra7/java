package com.mypackage;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		int id = rs.getInt("id");
		String name = rs.getString("name");
		int salary = rs.getInt("salary");
		String gender = rs.getString("gender");
		
		
		Employee e = new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setGender(gender);
		return e;
	}

}
