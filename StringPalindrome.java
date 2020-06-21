import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class StringPalindrome {
    public static void  main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter Some string");
		String str = br.readLine();;
        String str_reverse = "";
        for(int index = str.length()-1; index >=0; index--){
            str_reverse += str.charAt(index); 
        }
        System.out.println("Reverse string : "+str_reverse);
        if(str.equalsIgnoreCase(str_reverse)){
            System.out.println("Given string is palindrome");
        } else {
            System.out.println("Given string is not palindrome");
        }
    }
}