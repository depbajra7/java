package com.mypackage;

public class Employee {
	private int id;
	private String name;
	private int salary;
	private Address address;
	
	
	public Employee(int empid, String empName, int empSalary, Address empAddress) {
		this.id = empid;
		this.name = empName;
		this.salary = empSalary;
		this.address = empAddress;
		
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public Address getAddress() {
		return address;
	}
	
	
	
}
