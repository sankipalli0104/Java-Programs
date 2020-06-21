class X {
	int x;
	int t;
	X(Y y){
		x = y.y;
	}
	
	public void displya(){
		System.out.println("Value of X: "+x);
		System.out.println("Value of T: "+t);
	}

}