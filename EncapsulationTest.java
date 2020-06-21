class EncapsulationTest{
	public static void main(String str[]){
		
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setEmpId(5);
		obj.setEmpName("Siva");
		obj.setEmpAge(25);
		obj.setEmpSSN(123456748);
		System.out.println("Employee ID: " + obj.getEmpId());
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee Age: " + obj.getEmpAge());
		System.out.println("Employee SSN: " + obj.getEmpSSN());
	}
}