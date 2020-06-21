import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class StringCopy{
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		System.out.println("Please enter Some String : " );
		String str = new String(br.readLine());
		char[] arr_char = new char[str.length()];
		str.getChars(5, 16, arr_char, 0);
		
		System.out.println(arr_char);
		
		
	}
}