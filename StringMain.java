import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class StringMain {
  public static void main(String[] args) throws IOException {
  
  
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	System.out.print("Please Enter the String : ");
  	
  	String str = br.readLine();
  	
  	
  	/*String str_one = br.readLine();
  	String str_two = String.join(" 44 ", str_one, str_one);
  	System.out.println(str_two);*/
  	// matches();
  	/*
	 	System.out.print("Please Enter the String : ");
  		String str_one = br.readLine();
		System.out.println(str_one.matches("{a-z}_{A-Z}_{0-9}"));
  	*/
  	
  	//regionMatches(); 
  	/*System.out.print("Please Enter the String : ");
  	String str_one = br.readLine();
  	System.out.print("Please Enter the String : ");
  	String str_two = br.readLine();
  	
  	System.out.println(""+str_one.regionMatches(0, str_two, 0, 3));
  	System.out.println(""+str_one.regionMatches(true, 0, str_two, 0, 3));
  	
  	*/
  	//toLowerCase(), toUpperCase(), 
  	String upperCase = str.toUpperCase(CHINA);
  	System.out.print(upperCase);
  	System.out.print("Please Enter the String : ");
  	String str1 = br.readLine();
  	String lowerCase = str1.toUpperCase();
  	System.out.print(lowerCase);
  	System.out.println(upperCase.contentEquals(lowerCase));
  	
  	
  	
  	//getBytes();
  	/*byte[] array = str.getBytes();
    System.out.print("Default Charset encoding:" +array);
    for(byte b: array){
        System.out.print(b);
	}
	*/
  	//codePointCount();
  	/*
	System.out.printf("Total length of the string : %d \n", str.length());	
	int i = str.codePointCount(5, str.length());
	System.out.printf("Index code point count : %d ", i);	*/
	//toCharArray();
	/*char ch[] = str.toCharArray();
	System.out.println(ch);
	
	System.out.println("Hash Code of the String  : "+str.hashCode());
	System.out.println("Output String Value : "+str.toString());  	
  	*/
  	
  	
  	//intern(); 
  	/*String str = new String("Hello");
  	String str1 = "Hello";
  	
  	str.intern() == str1;
  	*/
  	//contains();
  	
  	//System.out.println(str.contains("IS"));
  	
  	//Trim() and Replace();
  	/*System.out.println(str.length());
  	
  	
  	String str1 = str.trim();
  	System.out.println(str1.length());
  	System.out.println(str1);
  System.out.println(str.replaceAll("\\s", ""));*/
  	//replace();
  	
  	//String str1 = str.replaceAll("is", "was");
  	//String str1 = str.replaceAll("\s", "");
  	//String str1 = str.trim();
  	
  	
  	/*String str1 = str.replace('a', 'e');
  	System.out.println("Replace String: " +str1);*/
  	// substring();
  	
  	//System.out.print("Substring of str : " +str.substring(1, 3));
  		
    
  
  //indexOf();
  /*	int index = str.i	ndexOf('s');
	index = str.lastIndexOf('s', 4);	
	System.out.println(index); 
  */
  
  
  //isEmpty();
  
  //System.out.println(str);
  //System.out.println(str.isEmpty());
  
  
  //Write a Java program to create a unique identifier of a given string
  
  /*System.out.print("Please Enter the String_One :");
  String str = br.readLine();
  System.out.println(str.hashCode());*/
  
  
 
 
 //Write a Java program to create a new String object with the contents of a character array.
 /*System.out.print("Please Enter the String_One :");
  String strOne = br.readLine();
  char ch[] = {'1','2','3','4','5'};
  String str = String.copyValueOf(ch, 0, 4);
  System.out.print(strOne+" "+str);*/
  
 //Write a Java program to compare a given string to the specified character sequence.
  /*System.out.print("Please Enter the String_One :");
  String strOne = br.readLine();
  System.out.print("Please Enter the String_Two :");
  String strTwo = br.readLine();
  boolean bln = strOne.equals(strTwo);
  System.out.println(strOne + " and " + strTwo +" : " +bln);*/
  
  //Write a Java program to test if a given string contains the specified sequence of char values
  /*System.out.print("Please Enter the String_One :");
  String str = br.readLine();
  System.out.print("Please Enter the Sequesnce of Character :");
  String strChar = br.readLine();
  System.out.println(str.contains(strChar));*/
  
  
  //Write a java program to compare two strings lexicographically.
  /*System.out.print("Please Enter the String_One :");
  String str_One = br.readLine();
  System.out.print("Please Enter the String_Two :");
  String str_Two = br.readLine();
  
  if(str_One.equalsIgnoreCase(str_Two)){
    System.out.println(str_One +" is equals to " +str_Two );
  } else {
    System.out.println(str_One +" is not equals to " +str_Two );
  }*/
  
  //Write a Java program to get the character at the given index within the String
  /*
  System.out.println("Please Enter the Index position: ");
  int indexPosition = Integer.parseInt(br.readLine());
  int ch = str.codePointAt(indexPosition);
  System.out.println("The character at position "+indexPosition +" is " +ch);*/
 }
}