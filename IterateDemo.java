
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;


public class IterateDemo{
	
	public static void main(String args[]){
		//create a new List
		List<Employee> employeeList = new ArrayList<Employee>();
		//add employee objects to the list
		employeeList.add( new Employee("E01", "Raj", "IT") );
		employeeList.add( new Employee("E02", "Jason", "Marketing") );
		employeeList.add( new Employee("E03", "Robert", "Supply Chain") );
		employeeList.add( new Employee("E04", "Vicky", "Logistics") );
		employeeList.add( new Employee("E05", "Rita", "IT") );
		Iterator<Employee> employee = employeeList.iterator();
		while (employee.hasNext()){
			System.out.println(employee.next());
		}
		Map<Integer, Employee> employeesMap = new HashMap<Integer, Employee>();
		employeesMap.put(1001, new Employee("E01", "Raj", "IT"));
		employeesMap.put(1002, new Employee("E02", "Jason", "Marketing"));
		employeesMap.put(1003, new Employee("E03", "Robert", "Supply Chain"));
		employeesMap.put(1004, new Employee("E05", "Rita", "IT") );
		Iterator<Map.Entry<Integer, Employee>> entry = employeesMap.entrySet().iterator();
		while(entry.hasNext()){
		Map.Entry<Integer, Employee> print = entry.next();
			System.out.println("\t"+print.getKey()+ "\t\t"+print.getValue());			
		}
	}
}
