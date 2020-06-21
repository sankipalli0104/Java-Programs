//package com.siva.apple;

public class Human{
	String name;
	int age;	 
	public static class Men{
		Human hu = new Human(); //is it correct way to instantiate object?
		Men(String name, int age ){ //default constructor type as, class access modifier is applied to default constructor 
			hu.name = name;
			hu.age = age;
		}
		public void displayMenDetails(){
			//Human hu = new Human();
			System.out.println("DisplayMenDetails Method ==> Name: "+hu.name +" Age: "+hu.age);
		}
		
	}
	public class Women{
		public Women(String name, int age){
			Human.this.name = name;
			Human.this.age = age;
		}
		public void displayWomenDetails(){
			System.out.println("DisplayWomenDetails Method ==>Name: "+name +" Age: "+age);
		}
	}
	
	public static void CallMethod(String type){
// 		Human human = new Human();
// 		if(type.matches("Men")){
// 			Human.Men men = new Human.Men("Siva", 26);
// 			men.displayMenDetails();
// 			System.out.println(human.displayDetails());
// 		} else if(type.matches("Women")){
// 			Human.Women women = human.new Women("mani", 25);
// 			women.displayWomenDetails();
// 			System.out.println(human.displayDetails());
// 		} else {
// 			System.out.println("Invalid type");
// 		}
 	}
	public String displayDetails(){
		return "Name: "+name +" Age: "+age;
	}
}