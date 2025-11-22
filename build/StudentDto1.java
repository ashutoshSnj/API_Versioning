package com.build;
public class StudentDto1 {
	 public String name;
	  String Address;
	  public StudentDto1() {
		
	}
	public StudentDto1(String name, String address) {
		super();
		this.name = name;
		Address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("iam called");
		this.name = name;
	}
	public String getAddress() {
		
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}

	}
