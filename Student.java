package com.apple.demo;
import com.apple.demo.Teacher;
public class Student extends Teacher {
	
	private int marks[];
	protected int[] getMarks() {
		return marks;
	}


	protected void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	public void setDetails() {
		setId(10);
	}
	
	
// 	int id;
// 	String name;
// 	String address;
// 	public int getId() {
// 		return id;
// 	}
// 	public void setId(int id) {
// 		this.id = id;
// 	}
// 	public String getName() {
// 		return name;
// 	}
// 	public void setName(String name) {
// 		this.name = name;
// 	}
// 	public String getAddress() {
// 		return address;
// 	}
// 	public void setAddress(String address) {
// 		this.address = address;
// 	}


	

}
