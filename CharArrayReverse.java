public class CharArrayReverse{
	public static void main(String[] str){
		char[] char_arr = {'a', 'b', 'c', 'd','e','f','r'};
		char temp;
		int left = 0, right =char_arr.length-1; ;
		while(left < right ){
			temp = char_arr[left];
            char_arr[left++] = char_arr[right];
            char_arr[right--] = temp;	
			
		}
		System.out.print(char_arr);
	}
}