//Write a program which accepts the marks of a student into a 1D array from the  keyboard and finds total marks and percentage. 

import java.util.Scanner;

public class CalculateTotalMarks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter TotalNumber of Subjects");
		int totalSubjects = sc.nextInt();
		int marks[] = new int[totalSubjects]; 
		int totalMarks = 0;
		for (int index =0; index < marks.length; index++){
			System.out.println("please enter Subject marks: "+index);
			marks[index] = sc.nextInt();
		}
		for (int index =0; index < marks.length; index++){
			totalMarks += marks[index];
		}
		System.out.printf("Total Marks: %d \n", totalMarks);
		
		if(totalMarks >0){
			float percentages = (float) totalMarks/totalSubjects;
			System.out.printf("Percentage : %f \n", percentages);
		} else{
			System.out.println("Percentage \"0 \" ");
		}
		
	}
}