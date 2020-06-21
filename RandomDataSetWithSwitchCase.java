import java.io.FileWriter;
import java.io.IOException;
public class RandomDataSetWithSwitchCase{
	public static void main(String[] args) throws IOException{
 		FileWriter fileWriter = new FileWriter("/Users/sankipalli/Documents/Java_Programs/samplefilename.txt");
     	fileWriter.write(String.format("  %5s %17s \n", "Value ", " Count"));
		int arr[] = new int[997940];
		int countArray[] = new int[20];
		int i=0,dataSetCount=0;
		while(dataSetCount < 997940){	 
			int random = (int)(Math.random()*20+1);
			switch(random){
				case 1:
					if(countArray[0] < 83000){
						arr[i++] = random;
						countArray[0]++;
						dataSetCount++;
					}
					break;
				case 2:
					if(countArray[1] < 83000){
						arr[i++] = random;
						countArray[1]++;
						dataSetCount++;
					}
					break;
				case 3:
					if(countArray[2] < 83000){
						arr[i++] = random;
						countArray[2]++;
						dataSetCount++;
					}
					break;
				case 4:
					if(countArray[3] < 83000){
						arr[i++] = random;
						countArray[3]++;
						dataSetCount++;
					}
					break;
				case 5:
					if(countArray[4] < 83000){
						arr[i++] = random;
						countArray[4]++;
						dataSetCount++;
					}
					break;
				case 6:
					if(countArray[5] < 83000){
						arr[i++] = random;
						countArray[5]++;
						dataSetCount++;
					}
					break;
				case 7:
					if(countArray[6] < 83000){
						arr[i++] = random;
						countArray[6]++;
						dataSetCount++;
					}
					break;
				case 8:
					if(countArray[7] < 83000){
						arr[i++] = random;
						countArray[7]++;
						dataSetCount++;
					}
					break;
				case 9:
					if(countArray[8] < 83000){
						arr[i++] = random;
						countArray[8]++;
						dataSetCount++;
					}
					break;
				case 10:
					if(countArray[9] < 83000){
						arr[i++] = random;
						countArray[9]++;
						dataSetCount++;
					}
					break;
				case 11:
					if(countArray[10] < 83000){
						arr[i++] = random;
						countArray[10]++;
						dataSetCount++;
					}
					break;
				case 12:
					if(countArray[11] < 83000){
						arr[i++] = random;
						countArray[11]++;
						dataSetCount++;
					}
					break;
				case 13:
					if(countArray[12] < 1000){
						arr[i++] = random;
						countArray[12]++;
						dataSetCount++;
					}
					break;
				case 14:
					if(countArray[13] < 500){
						arr[i++] = random;
						countArray[13]++;
						dataSetCount++;
					}
					break;
				case 15:
					if(countArray[14] < 250){
						arr[i++] = random;
						countArray[14]++;
						dataSetCount++;
					}
					break;
				case 16:
					if(countArray[15] < 100){
						arr[i++] = random;
						countArray[15]++;
						dataSetCount++;
					}
					break;
				case 17:
					if(countArray[16] < 50){
						arr[i++] = random;
						countArray[16]++;
						dataSetCount++;
					}
					break;
				case 18:
					if(countArray[17] < 25){
						arr[i++] = random;
						countArray[17]++;
						dataSetCount++;
					}
					break;
				case 19:
					if(countArray[18] < 10){
						arr[i++] = random;
						countArray[18]++;
						dataSetCount++;
					}
					break;
				case 20:
					if(countArray[19] < 5){
						arr[i++] = random;
						countArray[19]++;
						dataSetCount++;
					}
					break;
			}
		}
		System.out.printf(" %5s %16s \n", "Value ", " Count");
		for(int k= countArray.length-1; k >=0; k-- ){
			System.out.printf(" %5d %16d \n",k+1,countArray[k]);
			fileWriter.write(String.format("%5d %20d \n", k+1, countArray[k]));
		}
		fileWriter.close();
	}
}