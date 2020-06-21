import java.io.IOException;
public class Relate{
	public static void main(String ... str){
		
		One t1 = new One(new Two( new Three()));
		double cu = t1.cube(5);
		
		System.out.println("Cube root : "+cu);
		
		
// 		double sqr = t1.square(6);
// 		System.out.println("Square root : "+sqr);
		
	}

// public static void main(String ... str) throws IOException{
// 		
// 		BankAcct bank = new BankAcct(100000);
// 		bank.contact(9.5);
// 	}
	
	// public static void main(String ... str) throws IOException{
// 		double salary = 5000.75;
// 		salary = salary +salary*15/100;
// 		double sal = Math.floor(salary);
// 		System.out.println("Updated salary: "+sal);
// 	}
// 

}