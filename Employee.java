//write a class which return salary of an employee few employees will get taxable salary, few employee will get bonus and medical allowens;
public class Employee{

	private int id;
	private String name;
	private double salary;
	private double bonus;
	private double medicalAllowance;
	private boolean taxApplicable;
	
	
	public Employee(){
	}
	public Employee(int i, String n, double s){
		id = i;
		name = n;
		salary = s;
	}
	public Employee(int i, String n, double s,double b,double ma, boolean ta){
		id = i;
		name = n;
		salary = s;
		bonus = b;
		medicalAllowance = ma;
		taxApplicable = ta;
	}
	
	public void setId(int i){
		id = i;
	}
	public int getId(){
		return id;
	}
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setSalary(double s){
		salary = s;
	}
	public double getSalary(){
		return salary;
	}
	public void setBonus(double b){
		bonus = b;
	}
	public double getBonus(){
		return bonus;
	}
	public void setMedicalAllowence(double ma){
		medicalAllowance = ma;
	}
	public double getMedicalAllowence(){
		return medicalAllowance;
	}
	public void setTaxApplicable(boolean ta){
		taxApplicable = ta;
	}
	public boolean getTaxApplicable(){
		return taxApplicable;
	} 
	
	public void setParameters(int i, String n, double s){
		id = i;
		name = n;
		salary = s;
	}
	public String toString(){
		return " Id : "+id +" Name : "+name+" Salary : "+salary;
	}
}