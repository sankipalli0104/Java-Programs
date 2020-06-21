import java.io.*;
import java.util.Scanner;

public class Example{
	public static void main(String args[])throws IOException{
		
		/*InputStreamReader inputStream = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inputStream);
		System.out.println("please enter some char");
		char ch = (char)br.read();
		System.out.println(ch);
		*/
		
		 Scanner console = new Scanner(System.in);
		 System.out.println("please enter some value");
		 int length = console.nextInt();
		 System.out.println("you entered value is " +length);
		 	
	}
}