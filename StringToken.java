import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Scanner;



public class StringToken {
	public static void main(String args[]) throws IOException{
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter Some String:");
		String str = sc.nextLine();
		StringTokenizer st = new StringTokenizer(str,"@");  
    	while (st.hasMoreTokens()) {  
        	System.out.println("Token: "+st.nextToken());  
     	}  
     	
     	
		/*BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		
		System.out.println("Enter the Name, Age, Salary:");
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		
		String name = st.nextToken();
		String age = st.nextToken();
		String salary = st.nextToken();
		
		name = name.trim();
		age = age.trim();
		salary = salary.trim();
		
		String pname = name;
		int page = Integer.parseInt(age);
		float psalary = Float.parseFloat(salary);
		
		System.out.printf("Name: %s , Age: %d , Salary: %f", pname, page, psalary);	*/
	}
}