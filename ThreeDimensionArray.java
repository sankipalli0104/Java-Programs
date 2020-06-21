/**	Write a program in which we take a 3D array which consists of department wise  student marks. 
*	There are 3 departments and in each department,there are 2 students and each  student has marks in 3 subjects. 
*	We want to calculate total marks of each student. 
*/

public class ThreeDimensionArray{
	public static void main(String args[]){
	
		int arr[ ][ ][] = {{{50,51,52}, {60,61,62}},  
							{{70,71,72}, {80,81,82}},  
							{{65,66,67}, {75,76,77}}}; 
	
		int dept, student, marks, totalMarks = 0;
		
		for(dept =0; dept< arr.length; dept++){
			System.out.println("Department"+dept);
			System.out.println("---------------");
			for(student =0; student < arr[0].length; student++){
				System.out.println("Student"+student);
				System.out.println("================");
				for(marks = 0; marks < arr[0][0].length; marks++){
					totalMarks += arr[dept][student][marks];
					
				}
				System.out.println("TotalMarks of Student: "+totalMarks);
				totalMarks = 0;
				
			}
		}
	
	}
	

}
