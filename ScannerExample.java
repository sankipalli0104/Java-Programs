import java.util.Scanner;

public class ScannerExample{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Name ane age:");
		
		//Working Fine
		
		String name = sc.next();
		int age = sc.nextInt();
		System.out.printf("Name: %s Age: %d", name, age);
		
		//error
		/*String name = sc.next();
		int age = sc.nextInt();
		System.out.printf("Name: %s Age: %d", name, age);
		
		
		 /*Scanner in = new Scanner(System.in);  
          System.out.print("Enter your name: ");  
          String name = in.next();  
          System.out.println("Name is: " + name);*/                          
	}
}