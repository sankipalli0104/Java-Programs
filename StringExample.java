import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;



public class StringExample{
	public static void main(String args[]) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	//Scanner sc = new Scanner(System.in)
	System.out.println("Please enter String_One: ");	
	//String Declaration
	//String str= br.readLine();
	
	//char[] arr = {'S','i','v','a','L','a','k','s','h','m','a','i','a','h'}; 
	
	//String(char[] value, int offset, int count)
	//String str1 = new String(arr, 4,arr.length-4);
	String stringOne = new String();
	stringOne = br.readLine();
	System.out.println("Please enter some String_Two: ");	
	String stringTwo = new String();
	stringTwo = br.readLine();
	//String stringThree = new String();
	String stringThree = stringOne+stringTwo;
	System.out.println("String Concat Using + Symbol:"+stringThree);
	stringThree = stringOne.concat(stringTwo).concat("Siva  \n").concat("Ankipalli");
	System.out.println("String Concat Using Concat Method:"+stringThree);	
	int i = stringOne.compareTo(stringTwo);
	System.out.println("String compareTo Method:"+i);
	int index = stringOne.compareToIgnoreCase(stringTwo);	
	System.out.println("String compareToIgnoreCase Method:"+index);
	System.out.println("Using equals Method"+stringOne.equals(stringTwo));
	}
}