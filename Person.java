public class Person{
	//Propertise 
	int age;
	String name;
	//Action
	
	public Person(int i , String s){
		age = i;
		name = s;
	}
	public void talk(){
		System.out.println("Hi I'm "+name);
		System.out.println("My age is : "+age);
	}
	public void check(){
		if(age <= 30){
			System.out.println(name+" is young");
		} else if(age <=50){
			System.out.println(name+" is middle age");
		} else System.out.println(name+" is old ");
	}
}