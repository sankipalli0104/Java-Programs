class Two extends One  {  
	static int i=20;  
	void show()  {  
		System.out.println("sub class method:i= "+i);    
		super.show();  
		System.out.println("super i= "+ super.i);  
	}

// 	Three t3;
// 	
// 	public Two(Three t3){
// 		this.t3 = t3;
// 	}
// 	double square(double x){
// 		double sqr = x*t3.get(x);
// 		return sqr;
// 		
// 	} 
// 	
	
	/*int y;
	public Two(int y){
		this.y = y;
	}
	void display(){
		System.out.println("Two class value Y : "+y);
	}
	
	
	*/
	
	
	
	
	/*public void calculate(int x){
		System.out.println("Cube root of the Value is "+(x*x*x));
		
	}
	public double mySqrt(int x) {
        double temp;
        double sqrt = x/2;
        do{
            temp = sqrt;
            sqrt = (temp+(x/temp))/2;
        } while((temp -sqrt) != 0);
        System.out.println("Square root of "+x +"is "+ sqrt);
        return sqrt;
    }*/

}