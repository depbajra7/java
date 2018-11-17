package com.mypackage;

public final class Employee {

	private final int employeeid;
	private final String employeeName;
	private final int salary;
	private final Address address;
	
	
	Employee(int empid, String empname, int empsalary, Address a){
		this.employeeid = empid;
		this.employeeName=empname;
		this.salary = empsalary;
		this.address = a; 
	}
	
	public int getEmployeeid() {
		return employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public Address getAddress() {
		return address;
	}




}



