/**Factorial This is one of the simplest programs you can expect in interviews. It is generally asked to see if you can code or not. 
*Sometimes interviewer may also ask about changing a recursive solution to iterative one or vice-versa.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Factorial{
	public static void main(String a[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter the Integer");
		int givenValue = Integer.parseInt(br.readLine());
		int multiplication = 1;
		
		while(givenValue > 0){
			multiplication *= givenValue--;
		}
		
		/*while(givenValue > 0){
			multiplication *= givenValue;
			givenValue -= 1;  
		}*/
		/*for(int i = givenValue; i >=1; i--){
			multiplication *= i; 	
		}*/
		System.out.println(givenValue+"! is = "+multiplication);			
	}
}