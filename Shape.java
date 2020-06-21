class Shape{
	String siva;
	protected double length;
	Shape(double length){
		this.length = length;
	}
	public void area(){
		System.out.println("Area of Square: "+(length*length));
	}
}