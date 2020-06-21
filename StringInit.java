import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class StringInit {
	public static void main(String a[]) throws IOException {
  	 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	 	System.out.print("Please Enter the String : ");
  		String str_one = br.readLine();
		System.out.println(str_one.matches("{a-z}_A-Z_0-9]"));
	}
}
