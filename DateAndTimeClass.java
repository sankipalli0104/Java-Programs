import java.text.SimpleDateFormat;
import java.util.Date;
public class DateAndTimeClass{
	 
	 
	/*
	Write a Java method to display the current date and time. Go to the editor
	Expected Output: Current date and time: Wednesday January 25, 2017 7:47:43
	*/
	 public static void main(String ... str){
		
		//https://docs.oracle.com/javase/8/docs/api/
		//Date date = new Date();
		SimpleDateFormat dateFormat =  new SimpleDateFormat("EEEE MMMM dd, y  HH:m:ss a ");
		System.out.println(dateFormat.format(new Date()));
		
			 	 	
	 }
}