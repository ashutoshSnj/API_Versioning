package com.build;

public class StudentDto2 {
  String fullName;
  int RollNo;
   public String getFullName() {
	return fullName;
}
   
   
public void setFullName(String fullName) {
	this.fullName = fullName;
}


public int getRollNo() {
	return RollNo;
}




public void setRollNo(int rollNo) {
	RollNo = rollNo;
	
}
public StudentDto2() {
	
}
public StudentDto2(String fullName, int rollNo) {
	super();
	this.fullName = fullName;
	RollNo = rollNo;
}
   
}
