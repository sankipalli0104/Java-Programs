public class EmployeeDemo{
	public static void main(String ... str ){
		Employee ep = new Employee();
		ep.setSalary(123.099);
		ep.setBonus(25);
		ep.setMedicalAllowence(12);
		ep.setTaxApplicable(false);
		SalaryCalculation sc = new SalaryCalculation();
		double salary = sc.getSalary(ep);
		System.out.println("Employee Salary : "+salary);
	}	
}
