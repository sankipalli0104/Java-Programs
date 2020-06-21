public class Officer
{
  public Officer()
  {
    this("Kejri");			
    System.out.println("Hello World");
  }
 
  public Officer(String name)    	
  {
    System.out.println("Officer name is " + name);
  }
 
  public Officer(int salary)    	
  {
    this();				
    System.out.println("Officer salary is Rs." + salary);
  }
 
  public static void main(String args[])
  {
    Officer o1 = new Officer("Siva");       
  }
}
