import java.util.List;
import java.util.ArrayList;
import java.util.Spliterator;
import org.apache.commons.collections4.CollectionUtils;

public class ConvertListToArray{
	public static void main(String[] args){
		//create new List
        List<String> listLanguages = new ArrayList<>();//null;
        //Add elements to the List
        listLanguages.add("Java");
        listLanguages.add("C++");
        listLanguages.add("C");
        listLanguages.add("Cobol");
        listLanguages.add("Fortran");

        if(CollectionUtils.isNotEmpty(listLanguages)){ // This will check both null and empty
        //if(!listLanguages.isEmpty()){ // It will check empty`, but it will throw an NPE when it's null
       		System.out.println("=======Original List of Languages=======");
        	System.out.println(listLanguages);
        	System.out.println("*******toArray() Method  to convert from List to Array******");
        	String[] str = listLanguages.toArray(new String[listLanguages.size()]);//toArray() Method to convert List to Array 
        	for(String language : str){
        		System.out.print(language+" ");
        	}
        	System.out.println();
        	System.out.println("=======Set() Method=======");
        	listLanguages.set(3, "SaleForce"); // Set() method to Insert in the particular index
        	System.out.println(listLanguages);
        	
        	System.out.println("=======subList() Method=======");
        	List<String> sub = listLanguages.subList(2,4); // subList() Method 
        	System.out.println(sub);
        

        	System.out.println("=======spliterator() Method=======");

        	Spliterator languageSpliterator = listLanguages.spliterator();
        	System.out.println(languageSpliterator);
        } else{

        	System.out.println(" List is Empty or null");
        }
	}
}