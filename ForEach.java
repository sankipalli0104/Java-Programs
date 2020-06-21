import java.util.*;

class ForEach{
	public static void main(String a[]){
		Date date = new Date();
		System.out.println(date);
		int array[] = {1,2,3,4,5,6,7,8,9,10};
		for(int i : array){
			System.out.println(i);
		}
	}
}