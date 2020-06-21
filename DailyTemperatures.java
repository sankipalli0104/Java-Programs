/*
Given a list of daily temperatures T, return a list such that, for each day in the input, tells you how many days you would have to wait until a warmer temperature. If there is no future day for which this is possible, put 0 instead.

For example, given the list of temperatures 
T = [73, 74, 75, 71, 69, 72, 76, 73], your output should be [1, 1, 4, 2, 1, 1, 0, 0].
T= [74,73,72,72,75,61,69,70] D=[4,3,2,1,0,1,1,0]
*/
public class DailyTemperatures{
	public static void main(String ... args){
 		int input[] ={73, 74, 75, 71, 69, 72, 76, 73};
 		int output[] = new int[input.length];
 		int i= 0;
 		for(; i < input.length-1; i++){
 			int temp = input[i];
 			int days= 1;
 			int j = i+1;
 			while(j < input.length-1){
 				days++;
 				if(input[j] > temp ){
 					break;
 				}
 				
 				j++;
 			}
 			
 			output[i] = days;
 			System.out.print(i+" and " +days+"\n");
 		}
 		output[i] = 0;
		for(int k: output){
			System.out.print(k+" ");
		}	
 	}
}
