//package com.apple.store.service;
//import com.apple.store.database.Rectangle;

public class RectangleDemo{
	public static void main(String ... st){
		Rectangle re = new Rectangle(5, 5);
		//Rectangle re1;// = new Rectangle(re);
		Employee ep = new Employee(20, " ", 45.325565);
		re.area(re);
		re.area();
		double salary = re.getEmployeeId(ep);
		System.out.print("Salary : " +salary);
	}
}
