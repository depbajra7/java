package com.mypackage;

public class Address {
	private int addrid;
	private String state;
	private int zip;
	
	
	public Address(int addrid, String state, int zip) {
		this.addrid= addrid;
		this.state = state;
		this.zip = zip;
	}
	
	public int getAddrid() {
		return addrid;
	}
	
	public String getState() {
		return state;
	}
	
	public int getZip() {
		return zip;
	}
		
}
