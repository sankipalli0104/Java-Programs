import java.util.Scanner;

public class TwoDimensionArray{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter row size of the Array");
		int rowSize = sc.nextInt();
		System.out.println("Please Enter column Size size of the Array");
		int columnSize = sc.nextInt();
		int[][] array = new int[rowSize][columnSize];
		
		System.out.println("row size"+array.length);
		System.out.println("column Size"+array[0].length);
		for(int i = 0; i < rowSize; i++ ){
			for(int j= 0; j< columnSize; j++ ){
				System.out.print("Please Enter values of 2D array ["+i+"] ["+j+ "]:");
				array[i][j] = sc.nextInt();
			}
		}
		for(int i =0; i < array.length; i++){
 			for(int j =0; j< array[0].length; j++ ){
 				System.out.print(array[i][j]+" ");
 			}
 				System.out.println();
 		
 		}
	}
	
}


