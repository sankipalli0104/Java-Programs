public class EncapsulationDemo{
	//empId, empName; empAge, empSSN;
	private int empId;
	private String empName;
	private int empAge;
	private int empSSN;
	
	public int getEmpId(){
		return empId;
	}
	public String getEmpName(){
		return empName;
	} 
	public int getEmpAge(){
		return empAge;
	}
	public int getEmpSSN(){
		return empSSN;
	}
	public void setEmpId(int id){
		empId = id;
	}
	public void setEmpName(String name){
		empName = name;
	}
	public void setEmpAge(int age){
		empAge = age;
	}
	public void setEmpSSN(int ssn){
		empSSN = ssn;
	}

}