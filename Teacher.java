package com.apple.demo;

public class Teacher {
	
	private int id;
	private static String name;
	private String address;
	private float salary;
	

	protected int getId() {
		return id;
	}


	protected void setId(int id) {
		this.id = id;
	}


	protected String getName() {
		return name;
	}


	protected void setName(String name) {
		this.name = name;
	}


	protected String getAddress() {
		return address;
	}


	protected void setAddress(String address) {
		this.address = address;
	}


	protected float getSalary() {
		return salary;
	}


	protected void setSalary(float salary) {
		this.salary = salary;
	}
	protected void callingTeacherSalary(){
		TeacherSalary tc = new TeacherSalary();
		tc.teacherSalaryMethod();
	}
	
	private class TeacherSalary{
		
		public void teacherSalaryMethod(){
			System.out.println("Private Class and Inside Method ");
		}
	}
}
