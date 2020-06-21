public class Bank{
	private String accountNo;
	private double balance;
	private String customerName;
	private String customerEmail;
	private String customerPhoneNo;
	/*private Bank(){
		
	}	
	public Bank(String accountNo){
		this.accountNo = accountNo;
	}
	public Bank(int accountNo, int customerPhoneNo ){
		this.accountNo = accountNo;
		this.customerPhoneNo = customerPhoneNo;
	}
	*/
	public Bank(){
	
	}
	
	public Bank(String accountNo, double balance, String customerName,String customerPhoneNo, String customerEmail ){
		
		this.accountNo = accountNo;
		this.balance = balance;
		this.customerName = customerName;
		this.customerPhoneNo = customerPhoneNo;
		this.customerEmail = customerEmail;
	}
	
	
	public String getAccountNo(){
		return accountNo;
	}
	public void setAccountNo(String accountNo){
		this.accountNo = accountNo;
	} 
	public double getBalance(){
		return balance;
	}
	public void setBalance(int balance){
		this.balance = balance;
	}
	public String getCustomerName(){
		return customerName;
	}
	public void setCustomerName(String customerName){
		this.customerName = customerName;
	}
	public String getCustomerEmail(){
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail){
		this.customerEmail = customerEmail;
	}
	public String getCustomephoneNo(){
		return customerPhoneNo;
	}
	public void setCustomerPhoneNo(String customerPhoneNo){
		this.customerPhoneNo = customerPhoneNo;
	}
	 	
	
	public void displayDetails(){
		System.out.println(accountNo +" "+ customerName+ " " +balance +" "+customerPhoneNo +" "+customerEmail);
	}
	
	public void deposit(int depositAmount){
		this.balance += depositAmount;
		System.out.println("Deposited amount is: "+depositAmount+"Total available balance is : "+this.balance);
	}
	public void withdraw(int withdrawAmount){
		if(this.balance > withdrawAmount){
			this.balance -= withdrawAmount;
			System.out.println("Available balance is : "+this.balance);
		} else {
			System.out.println("Insufficient funds in your account and available balance is : "+this.balance);
		}
		
	}
	
	
	
}