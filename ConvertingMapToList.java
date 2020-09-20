//import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.stream.*;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;


public class ConvertingMapToList{
	public static void main(String args[]){		
		Map<String, Employee> employeeMap = new TreeMap<String, Employee>(); 
		employeeMap.put("emp01", new Employee("emp01", "Jason", "IT"));
		employeeMap.put("emp02", new Employee("emp02", "Aaron", "Supply Chain"));        
		employeeMap.put("emp03", new Employee("emp03", "Oliver", "Marketing"));
		employeeMap.put("emp04", new Employee("emp04", "Raj", "IT"));
		//Using Enhanced for Loop
		System.out.println("Using Enhanced for Loop");

		System.out.println("\t Key \t\t Values ");
		for(Map.Entry<String, Employee> entry: employeeMap.entrySet()){
			System.out.println("\t"+entry.getKey()+ "\t\t"+entry.getValue());
		} 
		ConvertingMapToList.collectionsDemo();

		//Using Iterator
		// System.out.println("Using Iterator");
		// Iterator<Map.Entry<String, Employee>> entry = employeeMap.entrySet().iterator();
		// while(entry.hasNext()){
		// Map.Entry<String, Employee> print = entry.next();
		// 	System.out.println("\t"+print.getKey()+ "\t\t"+print.getValue());			
		// }
		// //Using Lamda Expression
		// System.out.println("Using Lamda Expression");
		// employeeMap.entrySet().stream().forEach(e -> {
  //           System.out.println("\t"+e.getKey()+ "\t\t"+e.getValue());
  //       }); 
	}
	public static void collectionsDemo() {
		Set<String> sortedSet = new HashSet<String>();
		sortedSet.add("Bob");
		sortedSet.add("add");
		sortedSet.add("Sivan");
		sortedSet.add("Sam");
		sortedSet.add("Vamsil");
		sortedSet.add("Lucky");
		sortedSet.remove("Bob");
		Iterator<String> it = sortedSet.iterator();

		while(it.hasNext()){
			System.out.print(it.next()+"\t");
		}
		Set<Integer> numberSet = new HashSet<Integer>();
		numberSet.add(12);
		numberSet.add(23);
		numberSet.add(13);
		numberSet.add(14);
		System.out.println();
		System.out.println(numberSet);

	}
}