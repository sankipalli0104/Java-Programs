import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Comparator;
public class GettingArrayList{
	public static void main(String[] args){
		ArrayList<String> aList = new ArrayList<>(); 
        aList.add("Two");
        aList.add("One");
        aList.add("One");
        aList.add("Three");
        aList.add("Three");
        //Printing elements using ListIterator.
        ListIterator<String> it = aList.listIterator();
        System.out.println("#########= Forward Printing =########");
        while(it.hasNext()){
        	System.out.println(it.next());
        }
        System.out.println("@@@@@@@= Reverse Printing =@@@@@@@");
        while(it.hasPrevious()){ 
        	System.out.println(it.previous());
        }
        //Getting Firt elements of the List
        System.out.println("First element of the List= "+aList.get(0));
        System.out.println("Last element of the List= "+aList.get(aList.size()-1));
        //Using Lambda expression for printing the elements.
        System.out.println("*********= Using Lambda function for printing =********");
        aList.stream()
        .distinct()
        .sorted(Comparator.reverseOrder())
        //.filter(s -> s.contains("One"))
        .forEach(a -> System.out.print(a+" "));
        System.out.println("");

	}
}