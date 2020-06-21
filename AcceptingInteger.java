import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class AcceptingInteger{
	public static void main (String args[]) throws IOException{
	
	InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(inputStreamReader);
	System.out.println("Please enter Byte value");
	
	//if we do type casting here, why are we getting ascii value?
	int fl = br.read();
	System.out.println(fl);
	
	//byte by = Byte.parseByte(br.readLine());
	//System.out.println(by);	
	
	//System.out.print("Please enter character \n");

	//we are not getting ascii value
	/*char ch = br.readLine().charAt(0);
	System.out.print("Entered character \n"+ch);
	
	System.out.print("Enter sex (M/F):\n"); 
  	//error: incompatible types: possible lossy conversion from long to char
  	br.skip(2);
  	char sex = (char)br.read();
  	
  	//char sex = br.readLine().charAt(0);
	System.out.println("gender is "+sex);
	
	//System.out.print("Please enter float value");
	//float fl = Float.parseFloat(br.readLine());
	//System.out.println(fl);*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*System.out.println("Please enter Value");
	int value = Integer.parseInt(bufferedReader.readLine());
	
	System.out.println("Please enter integer Value");
	int intValue = bufferedReader.read();
	
	
	System.out.println(intValue + " " + value);
	//error: incompatible types: int cannot be converted to String
	//int inputValue = Integer.parseInt(bufferedReader.read());
	 int intValue = Integer.parseInt(bufferedReader.readLine());
	System.out.println("Entered Value is =" +intValue);
	System.out.println("Please enter short Value");
	short shortValue = Short.parseShort(bufferedReader.readLine());
	System.out.println("Entered Short Value is =" +shortValue);
	
	System.out.println("Please enter double Value");
	double doubleValue = Double.parseDouble(bufferedReader.readLine());
	System.out.println("Entered Double Value is =" +doubleValue);
	
	System.out.println("Please enter  Name");
	String str = bufferedReader.readLine();
	System.out.println("Entered Name " +str);*/

	
	
	
	}

}