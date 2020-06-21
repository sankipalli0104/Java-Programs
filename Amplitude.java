public class Amplitude{
	public static void main(String []args){

        int[] arr = { 3, 5, 1, 3, 9, 8 };
        int k = 2;
        if ((arr.length - k) >= 2) {
            int count = 0;
            int[] arr_count = new int[(arr.length + 1) - k];
            while (count < arr_count.length) {
                int temp = count;
                int max = 0, min = Integer.MAX_VALUE;
                for (int i = 0; i < arr.length; i++) {
                    if (i == temp && i < k) {
                        temp++;
                        continue;
                    }
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                }
                arr_count[count] = max - min;
                count++;
                k++;
            }
            for (int i : arr_count) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
            int amplitude = arr_count[0];
            for (int i = 1; i < arr_count.length; i++) {
                if (amplitude > arr_count[i]) {
                    amplitude = arr_count[i];
                }
            }
            System.out.printf("Amplitude: %d \n ", amplitude);
        }else{
			System.out.printf("N is :%d Which is greater than the Array Length \n", k);
 		}	
    
// 		if((arr.length-n) >=2 ){
// 			int startIndex=0, lastIndex= n;
// 			int new_arr[] = new int[arr.length-n];
// 			if((arr.length%n)==0){
// 				while(lastIndex <= arr.length){
// 				int j=0, temp=startIndex;
// 				for(int i = 0; i < arr.length; i++ ){
// 					if(i== temp && i < lastIndex){
// 						temp++;
// 						continue;
// 					}
// 				new_arr[j++]= arr[i];
// 				}
// 			startIndex +=n;
// 			lastIndex +=n;
// 			}
// 		} else{
// 			while(lastIndex < arr.length){
// 			int j=0, temp = startIndex;
// 			for(int i = 0; i < arr.length; i++ ){
// 				if(i== temp && i < lastIndex){
// 					temp++;
// 					continue;
// 				}
// 				new_arr[j++]= arr[i];
// 			}
// 			startIndex +=n;
// 			lastIndex +=n;
// 			}
// 		}
// 		for(int i: new_arr){
// 			System.out.print(i+" ");
// 		}
// 		int smallNumber = new_arr[0];
// 		int largeNumber = new_arr[0];
// 		for(int k=1; k < new_arr.length; k++){
// 			if(smallNumber > new_arr[k]){
// 				smallNumber = new_arr[k];
// 			}
// 			if(largeNumber < new_arr[k]){
// 				largeNumber = new_arr[k];
// 			}
// 		}
// 		int amplitude = largeNumber-smallNumber;
// 		System.out.printf("\nAmplitude of Maximal: %d and Minimal:%d is %d \n", largeNumber, smallNumber, amplitude);
// 		} else{
// 			System.out.printf("N is :%d Which is greater than the Array Length \n", n);
// 		}	
	}
}








