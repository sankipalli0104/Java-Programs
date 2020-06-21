import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SearchString{
	public static void main(String[] args) throws IOException{
	
		BufferedReader  br = new BufferedReader (new InputStreamReader(System.in));
		System.out.print("Please enter the size of the String: ");
		int stringSize = Integer.parseInt(br.readLine());
		String str[] = new String[stringSize];
		for (int index = 0; index < stringSize; index++){
			System.out.println("Please enter the String");
			str[index] = br.readLine();
		}
		System.out.println("Please Enter Search String");
		String str_search = br.readLine();
		boolean temp = false;
		for (int index = 0; index < stringSize; index++){
			if(str_search.equalsIgnoreCase(str[index])){
				System.out.println("Found at " +(index+1));
				temp = true;
				
			}
		}
		if(!temp)
		System.out.println("Not Found In the given String ");
	}
}