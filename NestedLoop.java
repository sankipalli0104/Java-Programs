class NestedLoop{
	public static void main(String a[]){
		int row = 5;
		/*for (int i = 1; i <=row; i++){
			for(int j= 1; j <=i ;j++  ){
				System.out.print(j);
			}
		System.out.println();
		
		}*/
		
		
		for (int i = 1; i <=row; i++){
		
			for(int j =1; j<= i ; j++){
				System.out.print("*");
			}
			System.out.println("*");
		}
		
		
	}

}