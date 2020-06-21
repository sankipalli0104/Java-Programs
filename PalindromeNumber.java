/**	This is generally asked as follow-up or alternative of the previous program. This time you need to check if given Integer is palindrome or not. 
*	An integer is called palindrome if it's equal to its reverse, e.g. 1001 is a palindrome, but 1234 is not because the reverse of 1234 is 4321 which is not equal to 1234. 
*	You can use divide by 10 to reduce the number and modulus 10 to get the last digit. This trick is used to solve this problem.
*/

public class PalindromeNumber{
	public static void main(String arags[]){
		int givenNumber = 4321; //41251
		int temp = givenNumber;
		int reverseNumber = 0;
		while( temp >0){
			reverseNumber = reverseNumber*10+(temp%10);
			temp =temp/10;
		}
		System.out.println("reverse of given Number = "+reverseNumber);
		if(givenNumber == reverseNumber){
			System.out.println("its a PalindromeNumber");
		} else {
			System.out.println("its not a PalindromeNumber");
		}
	}
	
}
