import java.util.*;
import java.util.stream.Collectors;
import org.apache.commons.collections4.*;
public class ConvertListToSet{
	public static void main(String args[]){
		List<String> listColors = new ArrayList<String>();
		listColors.add("Red");
		listColors.add("Blue");
		listColors.add("White");
		listColors.add("Green");
		listColors.add("Yellow");
		System.out.println(listColors);
		Set<String> hashSetColors = new TreeSet<>();//Using Constructor
		//setColors.addAll(listColors);//Using addAll Method
		CollectionUtils.addAll(hashSetColors, listColors);//Using Apache Commons
		//This is Simply create HashSet if you use thisway
		Set<String> treeSetColors = listColors.stream().collect(Collectors.toSet());//Using Stream Api
		
		System.out.println(hashSetColors);
		System.out.println(treeSetColors);
// 		for(String str: setColors){
// 			System.out.println(str);
// 		}
		//System.out.println(hashSetColors.values());
	}
}