import java.util.Scanner;


public class LeapYear{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the year");
		
		int year = sc.nextInt();
		if(year%100==0 && year%400==0){
			System.out.println(year +":Its a leap year");
		} else if(year%100!=0 && year%4==0){
			System.out.println(year +":Its a leap year");
		}
		else{
			System.out.println(year +": Its not a leap year");
		}
			
	}
}