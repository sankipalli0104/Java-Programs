/**	Write a Java program to check if a given number is prime or not. Remember, a prime number is a number 
*	which is not divisible by any other number, e.g. 3, 5, 7, 11, 13, 17, etc. 
*	Be prepared for cross, e.g. checking till the square root of a number, etc.
*/

public class PrimeNumber{
	public static void main(String[] args) {

  	int input = 99;
  	boolean temp = false;
  	for(int i=2; i <= input/2; i++){
  		System.out.print(i+" ");
  		if(input%i == 0){
  			temp = true;
  			break;
  		}
  	}
  	if(temp){
  		System.out.println(input+" is Not Prime Number");
  	}else{
  		System.out.print(input+" is Prime Number");
  	}
  	
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
            
//             int givenNumber = 97;
//             
//             for (int i = 2; i <givenNumber; i++){
//             	if(givenNumber %i == 0){
//             		System.out.println(givenNumber + "is Not Prime Number");	
//             	}
//             }
//             System.out.println()
//             
//             
//             
//             
//             
//             
            
            
            /*//define limit
            int givenNumber = 100;

            System.out.println("Prime numbers between 1 and " + givenNumber);

            for(int i=2; i < 100; i++){

                    boolean isPrime = true;

                    for(int j=2; j < i ; j++){

                            if(i % j == 0){
                                    isPrime = false;
                                    break;
                            }
                    }
                    if(isPrime)
                            System.out.print(i + " ");
            }*/
    }
}