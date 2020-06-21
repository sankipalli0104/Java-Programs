import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;



public class EquilateralTriangle{

	public static void main(String a[]) throws IOException{
		
		//BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		//System.out.println("Please enter size of EquilateralTriangle");
		//int sizeOfTrianle = Integer.parseInt(br.readLine());
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter size of EquilateralTriangle");
		int sizeOfTrianle = sc.nextInt();
		System.out.println("--------------------------------------");
		
		for (int i =1; i <=sizeOfTrianle; i++ ){
			int j;
			for(j =sizeOfTrianle; j>=i; j-- ){
				System.out.print(" ");
				
			}
			for (j = 1; j<= i; j++ ){
				System.out.print("* ");
				
			}
		System.out.println();
		}
	}
	public static void main(String[] str){
	
	}
}