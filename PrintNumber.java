public class PrintNumber{
	public static void printNum(int i){
		if(i >= 1){
			System.out.print(i+" ");
			printNum(i-1);
			System.out.print(i+" ");
		}
	}
	public static void positiveOrNegative( int i){
		if (i >= 0){
			System.out.println("Given is Positive");
		} else {
			System.out.println("Given is negative Number");
		}
	}
	public static void main(String ... str){
		PrintNumber.printNum(5);
	}
}

