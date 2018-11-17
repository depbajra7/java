package com.mypackage;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private String gender;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public int compareTo(Student that) {
		//return Integer.compare(this.id, that.id); //ascending order
		
		return Integer.compare(that.id,this.id); //descending order
	}
	
	
}
