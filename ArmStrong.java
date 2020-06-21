/**	A number is called an Armstrong number if it is equal to the cube of its every digit. 
*	For example, 153 is an Armstrong number because of 153= 1+ 125+27, which is equal to 1^3+5^3+3^3. 
*	You need to write a program to check if the given number is Armstrong number or not.
*/
public class ArmStrong{
	public static void main(String args[]){
		int givenNumber = 153;
		int a = givenNumber;
		int b = 0;
		while((a/10)>0){
			int remainder = a%10;
			b += remainder*remainder*remainder;
			a =a/10;
		}
		int armStrongNumber = a+b;
		System.out.println(armStrongNumber);
		if (givenNumber == armStrongNumber){
			System.out.println(givenNumber+" is a ArmStrong Number");
		} else {
			System.out.println(givenNumber+" is not a ArmString Number");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*int a = 1234;
		int copy = a;
		int temp = 0;
		
		while(copy/10 >= 1){
			int r = (copy%10)*10;
			//temp = temp +r;
			//System.out.println(temp);
			System.out.println(r);
			int q = copy/10;
			temp = temp +(r*10);
			copy = q;
			System.out.println(copy);
						System.out.println(temp);

		}int givenNumber = 1234;
		int reverseNumber =0;
		int copyOfGivenNumber = givenNumber;
		while(){
			int remainder = (copyOfGivenNumber%10)*10;
			int temp = remainder*10;
			quatient = copyOfGivenNumber/10;
			System.out.println(reverseNumber);
		}*/
	}
}