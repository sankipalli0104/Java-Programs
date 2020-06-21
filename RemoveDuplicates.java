/**	Write a program to remove duplicates from an array in Java without using the Java Collection API. 
*	The array can be an array of String, Integer or Character, your solution should be independent of the type of array. 
*	If you want to practice more array-based questions, then see this list of top 30 array interview questions from Java interviews
*/

import java.util.Scanner;

public class RemoveDuplicates{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Size of the array: ");
		int arraySize = sc.nextInt();
		int intArray[] = new int[arraySize];
		int[] newArray = new int[arraySize];
		for (int index= 0; index < arraySize; index++){
			System.out.println("Please enter values :"+index);
			intArray[index] = sc.nextInt();
		}
		int i,temp = 0;
		for(i =0; i < arraySize; i++){
			for(int j =0; j< arraySize -1; j++){
				if(intArray[j] > intArray[j+1]){
					temp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = temp;
				}
			}
		}
		System.out.print("After Sorting an Array: ");
		for(i =0; i < intArray.length; i++){
 		System.out.print(intArray[i] +" ");
 		
 		}
		System.out.println(" ");
		for(i =0; i < intArray.length; i++){
			if (i == intArray.length - 1)
				newArray[i] = intArray[i];
			else if(intArray[i]!= intArray[i+1]){
				newArray[i] = intArray[i];
			}	
		}

	
	
		
		
		System.out.print("After Remove Duplicates");
		for(i =0; i < newArray.length; i++){
 		System.out.print(newArray[i] +" ");
 		
 		}
		
	}
}