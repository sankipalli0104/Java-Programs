import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BankAcct{
	
	private double balance;
	
	public BankAcct(double balance){
		this.balance = balance;
	}
	public void contact(double rate) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("please enter the password: ");
		String password = br.readLine();
		if(password.equals("abc123")){
			FindInterestRate interest = new FindInterestRate(rate);
			interest.calculateInterest();
		} else {
			System.out.println("You don't have permission to perform this action, please contact system administrator");
		}
	}
	
	private class FindInterestRate{
		private double rate;
		public FindInterestRate(double rate){
			this.rate = rate;
		}
		public void calculateInterest(){
			double interest = balance* rate/100;
			balance += interest;
			System.out.println("Updated balance with Interest: "+balance);
		}
	
	}

}