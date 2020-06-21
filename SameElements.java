// 152. Write a Java program that accepts four integer from the user and prints equal if all four are equal, and not equal otherwise. Go to the editor
// 
// Sample Output:
// Input first number: 25
// Input second number: 37
// Input third number: 45
// Input fourth number: 23
// Numbers are not equal!
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class SameElements{
	
	public static void areSame(int ... arr) throws IOException{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		System.out.print("Please Enter the Number");
// 		int i = Integer.parseInt(br.readLine());
// 		System.out.print("Please Enter the Number");
// 		int j = Integer.parseInt(br.readLine());
// 		System.out.print("Please Enter the Number");
// 		int k = Integer.parseInt(br.readLine());
// 		System.out.print("Please Enter the Number");
// 		int l = Integer.parseInt(br.readLine());
		
		int count =1;
		for (int i =1; i < arr.length ; i++){
			if (arr[0] == arr[i]){
				count++;
			}
		}
		System.out.println("Array Length"+arr.length);
		System.out.println("Array Count"+count);
		if(arr.length == count){
			System.out.println("All the given Numbers are Equal");
		} else {
			System.out.println("All the given Numbers are Not Equal");
		}
	}	
	public static void main(String ... str) throws IOException{
		int i = SameElements.areSame(23,23,23,24,26,23);
		System.out.println("Sum of All Elements: "+i);
	}
}



