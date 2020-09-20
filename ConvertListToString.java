import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;


public class ConvertListToString{
	public static void main(String[] args){
		SortedSet<String> listDays = new TreeSet<String>();
		listDays.add("Sunday");
		listDays.add("Monday");
		listDays.add("Tuesday");
		listDays.add("Wednesday");
		listDays.add("Thursday");
		listDays.add("Friday");
		listDays.add("Saturday");
		System.out.println(listDays);
		System.out.println("Size of the list: " + listDays.size());
		String str = listDays.toString();
		//str= str.replaceAll(",","");
		str= str.replaceAll("\\[|\\]","");
		System.out.println(str);
		System.out.println("Length Of th String: "+str.length());

	}
}