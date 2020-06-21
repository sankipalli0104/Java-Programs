/**	You need to write a program to calculate the square root of a number without using the Math.sqrt() function of JDK. 
*	You need to write your logic and method to calculate the square root. You can though use the popular algorithm, like Newton's method
*/

public class SquareRoot{
	public static void main(String a[]){
		int givenNumber = 25;
		
		
		int squareRootOfGivenNumber = givenNumber*givenNumber;
		System.out.println("Square root of" +givenNumber +" = " +squareRootOfGivenNumber );
		
		int cubeRootOfGivenNumber = givenNumber*givenNumber*givenNumber;
		System.out.print("Cube root of " +givenNumber +" = " +cubeRootOfGivenNumber);		
	}
}