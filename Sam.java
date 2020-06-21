public class Sam{
	public static void amplitude(int arr[], int n){
		System.out.println("Array Length"+arr.length);
		
		int new_arr[] = new int[arr.length-n];
		System.out.println("New Array Length"+(arr.length-n));
		int startIndex=0;
		
		if((arr.length%2)==0){
			System.out.println("if");
			while(n < arr.length){
			int j=0, temp = startIndex;
			for(int i = 0; i < arr.length; i++ ){
				if(i== temp && i < n){
					temp++;
					continue;
				}
				new_arr[j++]= arr[i];
			}
			startIndex +=n;
			System.out.println("startIndex: "+startIndex);
			n +=n;
			System.out.println("N: "+n);
			}
		
		}else{
		System.out.println("Else");
			while(n <= arr.length){
			int j=0, temp = startIndex;
			for(int i = 0; i < arr.length; i++ ){
				if(i== temp && i < n){
					temp++;
					continue;
				}
				new_arr[j++]= arr[i];
			}
			startIndex +=n;
			n +=n;
			}
		}
		for(int i: new_arr){
			System.out.print(i+" ");
		}
		int smallNumber = new_arr[0];
		int largeNumber = new_arr[0];
		for(int k=1; k < new_arr.length; k++){
			if(smallNumber > new_arr[k]){
				smallNumber = new_arr[k];
			}
			if(largeNumber < new_arr[k]){
				largeNumber = new_arr[k];
			}
		}
 		int amplitude = largeNumber-smallNumber;
 		System.out.printf("\nAmplitude of Maximal: %d and Minimal:%d is %d", largeNumber, smallNumber, amplitude);
	}
	public static void main(String args[]){
		int arr[]= {2,3,5,7,8};//5,3,6,1,3   3,5,1,3,9,8   8,8,4,3
		Sam.amplitude(arr, 2);
	}
}