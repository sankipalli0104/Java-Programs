/**	Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . 
*	up to a given number. We prepare for cross questions like using iteration over recursion 
*	and how to optimize the solution using caching and memoization
*/
class Fibonacci{
	
	public static void main(String a[]){
	
		int i = Fibonacci.fib(3);
		System.out.println("Fibonacci "+i);
// 		int initialValue = 0;
// 		int secondValue = 1;
// 		int givenNumber = 6;
// 		
// 		System.out.print(initialValue+","+secondValue+","); 
// 		for(int i = 1; i<givenNumber-1; i++){
// 			int sumOfTwoNumbers = initialValue + secondValue;
// 			System.out.print(sumOfTwoNumbers+",");
// 			initialValue = secondValue;
// 			secondValue = sumOfTwoNumbers;
// 		}
 	}
	public static int fib(int number){ 
			if(number == 0){
				return 0;
			} else if(number == 1){
				return 1;
			}else {
				//System.out.println(" "+number);
				return fib(number-1)+fib(number-2);
			}
	}

}