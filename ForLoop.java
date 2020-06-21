class ForLoop {
	public static void main(String args[]){
		int loopingVariable = 20;
		int i= 0;
		
		//i<=loopingVariable
		for ( ;; ){
			System.out.println("Value of I \t" +i);
			i++;
			if(i>=loopingVariable) break;
		}
			
	}
	
}