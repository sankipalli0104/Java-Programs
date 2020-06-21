import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
public class GenerateRandomNumbers{
	public static void main(String[] args) throws IOException{   	
// 		FileWriter fileWriter = new FileWriter("/Users/sankipalli/Documents/Java_Programs/samplefilename.txt");
//     	fileWriter.write(String.format("  %5s %16s \n", "Value ", " Count"));
		
		//int number = 20;
		int[] init_array = new int[997940];
		int[] new_array = new int[20];
		int[] times = new int[20];
    	System.out.printf(" %5s %16s \n", "Value ", " Count");
//     	for (int i= 0; i < init_array.length; i++){
//     		int rand = (int)(Math.random()*20+1);
// 			init_array[i] = rand;
//     	}
// No two consecutive numbers should be the same in the generated dataset
    	for (int i= 0; i < init_array.length; i++){
    		int rand = (int)(Math.random()*20+1);
    		if(i == 0 || i == init_array.length-1){
    			if (i == 0){
    			init_array[i] = rand;
    			}else{
    				if(init_array[i-1] != rand && init_array[i-1] != 0){
    					init_array[i] = rand;
    				}else if(init_array[i-1] == 0){
    					init_array[i-1] = rand;
    				}else{
    					init_array[i] = (int)(Math.random()*20+1);
    				}
    			}
    		}else{
    			if(init_array[i-1] != 0 && init_array[i-1] != rand){
    				init_array[i] = rand;
    			}else if(init_array[i-1] == 0 ) {
    				init_array[i-1] = rand; 
    			}else{
    				init_array[i+1] = rand;
    			}
    		}
    	}
    	for(int i: init_array){
    		System.out.print(i+" ");
    	}
    	
//Sorting the array		
// 		for (int i = 0; i < init_array.length; i++) {
//             for (int j = i + 1; j < init_array.length; j++) { 
//                 if (init_array[i] > init_array[j]) {
//                     int temp = init_array[i];
//                     init_array[i] = init_array[j];
//                     init_array[j] = temp;
//                 }
//             }
//         }
//		Arrays.sort(init_array);
        
//removing Duplicate elements 
// 		int j = 0;
// 		for(int i = 0; i< init_array.length-1; i++){
// 			if(init_array[i]!=init_array[i+1]){
// 				new_array[j++]= init_array[i];
// 			}
// 		} 
// 		new_array[j] = init_array[init_array.length-1];
//Generating numbers from 1 to 20 and storing them in new array;
// 		int value = 1;
// 		for(int i = 0; i < new_array.length; i++){
// 			new_array[i] = value;
// 			value++;
// 		}
		
//Comparing new Array with initial array element to get the count of the particular element and Storing it an array 
// 		for(int index= 0; index < new_array.length; index++ ){
// 			int count =0;
// 			for (int t = 0; t < init_array.length; t++){
// 				if(new_array[index]==init_array[t]){
// 					count++;
// 				}
// 			}
// 			times[index] = count; 
// 		}
//  		for (int i = new_array.length-1; i >= 0; i--) {
//      		System.out.printf(" %5d %16d \n",new_array[i], times[i]);
//      		fileWriter.write(String.format("%5d %20d \n", new_array[i], times[i]));
//  		}
//  		fileWriter.close();
	}
}