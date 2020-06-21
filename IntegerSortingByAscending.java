/**
*Write a program which performs sorting of group of integer values using bubble sort  technique. 
*Sort a group of integers into ascending order 
*/

import java.util.Scanner;
import java.util.Scanner;
public class IntegerSortingByAscending{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Size of the array: ");
		int arraySize = sc.nextInt();
		int intArray[] = new int[arraySize];
		int newArray[] = new int[arraySize];
		for (int index= 0; index < arraySize; index++){
			System.out.println("Please enter values :"+index);
			intArray[index] = sc.nextInt();
		}
		int temp = 0;
		for(int i =0; i < arraySize; i++){
			for(int j =0; j< arraySize -1; j++){
				if(intArray[j] > intArray[j+1]){
					temp = intArray[j];
					intArray[j] = intArray[j+1];
					intArray[j+1] = temp;
				}
			}
		}		
		for(int i =0; i < intArray.length; i++){
 		System.out.print(intArray[i] +" ");
 		
 		}	
	}
}