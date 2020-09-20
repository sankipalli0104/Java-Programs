import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import org.apache.commons.collections4.*;
public class FindMinMaxValuesInList {
	public static void main(String[] args) {
		List<Integer> aListMarks = null;//new ArrayList<Integer>();
        //add elements to ArrayList
        // aListMarks.add(53);
        // aListMarks.add(67);
        // aListMarks.add(89);
        // aListMarks.add(43);
        // aListMarks.add(87);
        // aListMarks.add(71);
        // aListMarks.add(63);
        // aListMarks.add(45);
        // aListMarks.add(69);
        // aListMarks.add(53);
        //Using Collections min() and max() methods 
        //System.out.println("Minumum Number is :"+Collections.min(aListMarks));
        //System.out.println("Maximum Number is :"+Collections.max(aListMarks));
        //if(CollectionUtils.isNotEmpty(aListMarks)){ // Using CollectionUtils.isNotEmpty method 
        if (aListMarks != null){
        	if(aListMarks.size() > 0){	
		        int min = aListMarks.get(0);
		        for(int t =1; t < aListMarks.size(); t++){
		        	if(aListMarks.get(t) < min){
		        		min = aListMarks.get(t);
		        	}
		        }
		        System.out.print("Minumum Number is :"+min+"\t");
		        System.out.println("Index of Minumum Value is: "+aListMarks.indexOf(min));
		        int max = aListMarks.get(0);
		        for(int t =1; t < aListMarks.size(); t++){
		        	if(aListMarks.get(t) > max){
		        		max = aListMarks.get(t);
		        	}
		        }
		        System.out.print("Maximum Number is :"+max+"\t");
		        System.out.println("Index of Maximum Value is: "+aListMarks.indexOf(max));
			}
			else{
				System.out.println("List is not null and Size is 0");
			}
        }else{
			System.out.println("List is null");
		}

	}

}