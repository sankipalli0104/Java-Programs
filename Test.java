//package com.apple.store.database;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.io.IOException;
//import com.apple.store.database.Student;
import java.util.Scanner;
class Test{
	
	public static void main(String str[]){
		
		int t = Test.largestNumber(25, 22,3,25, 100, 45,78,14,12);
		System.out.println("largest Number is :"+t);
	}
	
	public static int largestNumber(int ... in){
    	int i,temp=0;
		for(i = 0; i < in.length-1; i++){
			System.out.println(i+"Before Swap Position"+in[i]);
			System.out.println(i+1 +"Before Swap Position"+in[i+1]);
			if(in[i] > in[i+1]){
				temp = in[i];
				in[i] = in[i+1];
				in[i+1] = temp;
				
			}
			System.out.println(i+"After Swap Position"+in[i]);
			System.out.println(i+1 +"After Swap Position"+in[i+1]);
		}
		return in[in.length-1];
	}
	
	
	
	
	/*static {
 		System.out.println("Printing Value A in Static block : ");
 		//System.exit(0);
 	}
 	
 	int a = 10, b = 20;
 	
 	private void swap(Test obj) {
 	
 	
 	
 	
 		int temp = obj.a;
 		obj.a = obj.b;
 		obj.b = temp;
 		System.out.println("Inside Swap "+ obj.a + " " + obj.b);
 	}
 	
 	public void sum(int b, int ... i, int ... j){
 		System.out.println(i[0]);
 	}
 	
 	public static void main(String a[]) {
 		
 		Test obj = new Test();
 		System.out.println("Before Swap " + obj.a + " " + obj.b);
 		obj.swap(obj);
 		System.out.println("After Swap " + obj.a + " " + obj.b);
 		obj.sum(10, 20, 30);
 	}*/
 	/*{
 		System.out.println("Instance Block");
 		
 	}*/
 	/*public static void main(String str[]){
 		Test ts = new Test();
 		System.out.println("Printing Value A in Static Method : ");
 	}*/






	/*int s ;
	int t;
	
	Test(int s, int t){
		this.s = s;
		this.t = t;
		
	}
	/*public static void main(String str[]){
		Test ts = new Test(25, 35);
		System.out.println(ts.s+" "+ts.t);
	}*/
	  /*int m1(int f){
		System.out.println("Before IF");
		if(f == 10){
			System.out.println(" In IF");
			return f+s;
		}
		System.out.println("After IF");
		System.out.println("HI");
		return f;
		
	}	
	
	public static int m2(int a ){
		//Test ts = new Test();
		if (a == 10){
			System.out.println("In IF");
			int x = Test.m1(10);
			return a+x;
		}
		System.out.println("AFTER IF");
		return Test.m1(20);
	}
	public static void main(String str[]){
		
		int i = m2(10);
		System.out.println("Value of I : "+i);
	}*/
	
	
	/*public double temparature;
	public static double maxTemp = 0;
	
	Test(int t){
		temparature = t;
		if (t > maxTemp){
			maxTemp = t;
		}
	}
	
	public static void printMax()
  {
     System.out.println(temparature);
  }
	
	public static void main(String str[]){
		Test t1 = new Test(75);
		System.out.println("max Temparature: "+maxTemp);
		Test t2 = new Test(100);
		System.out.println("max Temparature: "+maxTemp);
		t2.printMax();		
	}	
	*/
	
	
	//static int a = 10; 
 	

 	/*
 	public Test(){
 		System.out.println("Printing Value A in	Constructor : "+a);
 	}
 	
 	
 	public static void staticMethod(){
 		System.out.println("Printing Value A in Static Method : "+a);
 	}
 	public void instanceMethod(){
 		System.out.println("Printing Value A in instance Method: "+a);
 	}
 	public static void main(String str[]){
 		System.out.println("Main Method");
 	}*/
}