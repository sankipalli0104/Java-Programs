import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class StringBufferDemo{
	public static void main(String args[]) throws IOException{
	
		BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string : ");
		StringBuffer sb = new StringBuffer(br.readLine());
		char ch[]= {'a','b','c','d','e','f'};
		
		sb.insert(6, ch, 0, 5);
		
		System.out.println("After Insert the Array : "+sb);
		sb.insert(0, ch);
		System.out.println("After Insert the Array : "+sb);
		sb.append(25);
		System.out.println("After Insert the Array : "+sb);
		int i = sb.lastIndexOf("abcde",);
		System.out.println("Last Index of the abcde"+i);
		System.out.println("Length of the String "+sb.length());
		sb.trimToSize();
		System.out.println("Length of the String "+sb.length());
		//float  array = 1213.00121200f;
		//sb.append(array);
		//sb.delete(0,2);
		//int it = sb.length();
		//sb.deleteCharAt(--it);
		//sb.replace(0,6, "String");
		//String st= sb.substring(4, 15);
		//System.out.println(sb.subSequence(1, 4));
		//System.out.println("Given String  "+sb);
		//System.out.println(" Substring  "+st);
		
		//System.out.println("Length of the String "+sb.length());	
	
	
	
	/*	System.out.println("capacity "+sb.capacity());
		System.out.println(" Length  "+sb.length());
		sb.append(sb);									//append(String);	
		sb.insert(sb.length(), " Siva "); 				//insert(int, String);
		
		System.out.println(sb.toString());
		System.out.println("capacity "+sb.capacity());
		System.out.println(" Length  "+sb.length());
		sb.delete(12, 15);								//delete(int , int);
		System.out.println("After Delete : "+sb);
		System.out.println(sb.lastIndexOf("Si"));		//lastIndexOf(String)
		sb.reverse();									//reverse();
		System.out.println("Reverse string : "+sb);
				
	*/
		
		
		/*System.out.printf(" Capacity of String Buffer before append String :%s \n", sb.capacity());
		sb.append("Hello World, Hi Java Programmer How are you doing , Hi Siva Lakshmaiah Ankipalli");
		
		System.out.printf(" Capacity of String Buffer After append String :%s \n", sb.capacity());// used to find out the capacity of the le
		System.out.printf(" Length of String Buffer After append String :%d \n", sb.length());// used to find out the length of the given string
		System.out.println(sb);
		sb.insert(10, "Hellooo");//Used to insert the the string in particular index 
		System.out.println(sb);
		//sb.reverse();// Used to reverse the string int the same object;
		sb.delete(10, 17);// this method is used to delete the charectars from first given index to last given index;  
		System.out.println(sb);
		
		int i = sb.indexOf(" "); //it returns the index position of first occurence of the given string
		System.out.println(i);
		int j = sb.lastIndexOf(" ");//it returns the index position of last occurence of the given string
		System.out.println(j);
		String arr = "India";	
		sb.replace(6, 11, arr);
		System.out.println(sb);*/
	}
}