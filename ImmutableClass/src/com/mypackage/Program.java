package com.mypackage;

public class Program {
	public static void main(String[] args) {
		Address a = new Address();
		a.setCity("alva");
		a.setLine1("202 flynn st");
		a.setLine2("apt");
		a.setState("OH");
		a.setZipcode(12345);
		
		Employee e = new Employee(1,"john",10000,a);
		System.out.println(e.getEmployeeid());
		System.out.println(e.getEmployeeName());
		System.out.println(e.getSalary());
		System.out.println(a.getCity());
		Address add = e.getAddress();
		
		
		
		System.out.println(add.getCity());
		System.out.println(add.getLine1());
		System.out.println(add.getZipcode());
	}

}
