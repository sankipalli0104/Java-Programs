package com.apple.store.database;
//import com.apple.store.database.DataBase;


public class TestClass extends DataBase{
	
	public TestClass(){
		super(10);
	}
	
	public void display(){
		System.out.println("protected variable " +super.intValue);
	}
	
	/*public static void main(String[] args){
	
	DataBase db = new DataBase();
	db.intValue = 25;
	db.disp();
	
	
	/*Service sr  = new Service();
	sr.intValue = 52;
	
	//Service sr = Service.getInstance(20);
	sr.methodTest();
	Student s1 = new Student(100,"Ram");
        Student s2 = new Student(200,"Rahim",18);
        s1.show();
        s2.show();
	
	
	TestClass.methodTest2();
	
	}*/
	//private static void methodTest2(){
		//System.out.println("Simple method for test");
	//}*/

}