/**
Find The First Non Repeated Character In A String : Technical Interview Question
If the word "stress" is input  then it should print  't'   as output .
If the word "teeter" is input  then it should print  'r'   as output .
*/
import java.util.Scanner;
public class FindNonRepeatingCharacter{

	public static void main(String ... str1){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the string");
		String str = sc.nextLine();
		//String newString = " ";
		for(int i =0 ; i< str.length(); i++){
			char ch = str.charAt(i);
			for(int j = 1 ; j < str.length(); j++){
				if(ch == str.charAt(j)){
				
				}
			}
			System.out.println(ch);
		}
		//System.out.println(newString);
		
	}
}