import java.io.FileWriter;
import java.io.IOException;
public class NoTwoConsecutiveNumbersSame{
	public static void main(String[] args) throws IOException{
	int arr[] = new int[100];
	int i=1, dataSetCount=0;
	arr[0] = (int)(Math.random()*100+1);
	while(dataSetCount < 99){
		int random = (int)(Math.random()*100+1);
		
			if(arr[i-1]!= random){
				arr[i++]= random;
				dataSetCount++;
			}		
		
	}
	arr[arr.length-1] = (int)(Math.random()*100+1);
	for(int j: arr){
		System.out.print(j+" ");
	}
    	
		
		
// 		if(i == 0 || i == arr.length-1){
//     		if (i == 0){
//     			arr[i] = random;
//     			dataSetCount++;
//     		}else{
//     			if(arr[i-1] != random && arr[i-1] != 0){
//     				arr[i] = random;
//     				dataSetCount++;
//     			}else if(arr[i-1] == 0){
//     				//arr[i-1] = random;
//     				break;
//     			}else{
// 					arr[i] = random;
// 					dataSetCount++;
//    				}
//    			}
//     	}else{
//     		if(arr[i-1] != 0 && arr[i-1] != random){
//     			arr[i] = random;
//     			dataSetCount++;
//     		}else if(arr[i-1] == 0) {
//     			//arr[i-1] = random; 
//     			break;
//     		}else{
//     			arr[i+1] = random;
//     			dataSetCount++;
//     		}
//     	}
	
	
	
	
//  		FileWriter fileWriter = new FileWriter("/Users/sankipalli/Documents/Java_Programs/samplefilename.txt");
//      	fileWriter.write(String.format("  %5s %17s \n", "Value ", " Count"));
// 		int arr[] = new int[997940];
// 		int countArray[] = new int[20];
// 		int i=0,dataSetCount=0;
// 		while(dataSetCount < 997940){	 
// 			int random = (int)(Math.random()*20+1);
// 			switch(random){
// 				case 1:
// 					if(countArray[0] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;	
// 					countArray[0]++;
// 					dataSetCount++;
// 					}
// 					break;
// 				case 2:
// 					if(countArray[1] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] =random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[1]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 3:
// 					if(countArray[2] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[2]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 4:
// 					if(countArray[3] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;						
// 					countArray[3]++;
// 					dataSetCount++;
// 					}
// 					break;
// 				case 5:
// 					if(countArray[4] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 					countArray[4]++;
// 					dataSetCount++;
// 					}
// 					break;
// 				case 6:
// 					if(countArray[5] < 83000){
// 											if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 					countArray[5]++;
// 					dataSetCount++;
// 					}
// 					break;
// 				case 7:
// 					if(countArray[6] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[6]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 8:
// 					if(countArray[7] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[7]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 9:
// 					if(countArray[8] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[8]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 10:
// 					if(countArray[9] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[9]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 11:
// 					if(countArray[10] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[10]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 12:
// 					if(countArray[11] < 83000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[11]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 13:
// 					if(countArray[12] < 1000){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[12]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 14:
// 					if(countArray[13] < 500){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[13]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 15:
// 					if(countArray[14] < 250){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[14]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 16:
// 					if(countArray[15] < 100){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[15]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 17:
// 					if(countArray[16] < 50){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[16]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 18:
// 					if(countArray[17] < 25){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[17]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 19:
// 					if(countArray[18] < 10){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[18]++;
// 						dataSetCount++;
// 					}
// 					break;
// 				case 20:
// 					if(countArray[19] < 5){
// 						if(i == 0 || i == arr.length-1){
//     						if (i == 0){
//     							arr[i] = random;
//     						}else{
//     						if(arr[i-1] != random && arr[i-1] != 0){
//     							arr[i] = random;
//     							}else if(arr[i-1] == 0){
//     								arr[i-1] = random;
//     							}else{
//     								arr[i] = random;
//     							}
//     						}
//     				}else{
//     					if(arr[i-1] != 0 && arr[i-1] != random){
//     						arr[i] = random;
//     					}else if(arr[i-1] == 0) {
//     						arr[i-1] = random; 
//     					}else{
//     						arr[i+1] = random;
//     					}
//     				}
// 					i++;
// 						countArray[19]++;
// 						dataSetCount++;
// 					}
// 					break;
// 			}
// 		}
// 		for (int k: arr){
// 			System.out.print(k+" ");
// 		}
// 		System.out.printf(" %5s %16s \n", "Value ", " Count");
// 		for(int k= countArray.length-1; k >=0; k-- ){
// 			System.out.printf(" %5d %16d \n",k+1,countArray[k]);
// 			fileWriter.write(String.format("%5d %20d \n", k+1, countArray[k]));
// 		}
// 		fileWriter.close();
// 
     }
}