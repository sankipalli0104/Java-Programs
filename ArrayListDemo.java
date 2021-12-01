import java.util.*;
import java.lang.reflect.Field;

public class ArrayListDemo{
	public static void main(String args[]) throws Exception{
// 		List<Number> listNumber_ListNumber = new ArrayList<Number>();
// 		List<Integer> listNumber_ListInteger = (Integer)new ArrayList<Number>(); // error - can assign only exactly <Number>
// 		List<Double> listNumber_ListDouble = (Double)new ArrayList<Number>(); // error - can assign only exactly <Number>
//		List<? extends Number> listExtendsNumber_ListNumber = new ArrayList<String>();
// newarray Capacity = (oldCapacity * 3)/2 + 1
		List<? super Integer> listSuperNumber_ListInteger = new ArrayList<Number>();
		ArrayList<Integer> aListNumbers = new ArrayList<Integer>(2);
		System.out.println("ArrayList size : " + aListNumbers.size());
		System.out.println("ArrayList Capacity : "+getArrayListCapacity(aListNumbers));
	}
	    private static int getArrayListCapacity(ArrayList<Integer> list) throws Exception{
        
        //get the elementData field from ArrayList class
        Field arrayField = ArrayList.class.getDeclaredField("elementData");
        
        /*
         * Since the elementData field is private, we need 
         * to make it accessible first 
         */
        arrayField.setAccessible(true);
        
        //now get the elementData Object array from our list
        Object[] internalArray = (Object[])arrayField.get(list);
        
        //Internal array length is the ArrayList capacity!
        return internalArray.length;
    }
}