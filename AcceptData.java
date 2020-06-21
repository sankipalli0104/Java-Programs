import java.io.*;

class AcceptData {

  public static void main(String a[]) throws IOException {
  
  	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	//accept employee details 
  	 System.out.print("Enter id:");  
  	 int id = Integer.parseInt(br.readLine());  
  	 System.out.print("Enter sex (M/F):"); 
  	 
  	 //error: incompatible types: possible lossy conversion from long to char
  	 char sex = br.skip(2);
  	 
  	 //char sex = br.readLine().charAt(0);  
  	 System.out.print("Enter name:"); 
  	  String name = br.readLine();  
  	  //display the employee details 
  	   System.out.println("Id= "+ id); 
  	    System.out.println("Sex= "+ sex); 
  	     System.out.println("Name= "+ name); 

  
  }

}