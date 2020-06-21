//https://www.w3resource.com/java-exercises/method/index.php

import java.util.Scanner;

public class Solution {
	public static void main(String ... arg){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str = str1.toLowerCase();
		int count = 0;
		for(int j= 0; j < str.length(); j++){
			if((str.charAt(j)=='a')||(str.charAt(j)=='e')||(str.charAt(j)=='i')||(str.charAt(j)=='o')||(str.charAt(j)=='u')){
				count++;
			}			 
		}
		System.out.printf("Number of  Vowels in the string :%s is %d ",str, count);
		
	}
	
	public static void main(String arg[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter Some String: ");
		String str = new String(br.readLine());
		String str_new[] = str.split(" ");
		System.out.println("Number of words in the string:"+str_new.length);
	
		for(int index = 0; index < str_new.length; index++){
			System.out.print(str_new[index] +"\t");
		}
	}

	
	public int smallestNmber(int ... in){
    	int i,temp = 0;
		for(i =0; i < in.length; i++){
			for(int j =0; j< in.length -1; j++){
				if(in[j] > in[j+1]){
					temp = in[j];
					in[j] = in[j+1];
					in[j+1] = temp;
				}
			}
		}
		return in[0];
	}
	/*//https://www.hackerrank.com/challenges/java-loops/problem 	
	public static void main(String ... str){
		Scanner in = new Scanner(System.in);	
		int a= in.nextInt();
		int b= in.nextInt();
		int n= in.nextInt();
		int res = 0;
        for(int i = 0; i <n; i++){
            if(i == 0){
                res = a+b;
            } else {
                int power = MathClass.powerOfNumber(2, i);
                res += (power*b);                 
            }
            System.out.print(res+" ");
        }
	}*/	
	
	 /*public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //String s = scan.nextLine();
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        System.out.println("String: " +s);
        System.out.println("Double: " +d);
        System.out.println("Int: " +i);
    }*/
   /* public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the value of n ");
        int n = scanner.nextInt();
        String str = "";
        if(n%2 != 0||((n%2 ==0)&&(n >= 6 && n <= 20)));
                   str = "Weird";
            System.out.println(str);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
        } else {
            str = "Not Weird";
            System.out.println(str);
        }
    }*/
}