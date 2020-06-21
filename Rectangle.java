class Rectangle extends Square {
	private double width;
	
	Rectangle(double length, double width){
		super(length);
		this.width = width;
	}
	public void area(){
		System.out.println("Area of Rectangle: "+(length*width));
	}
	public void printSiva(){
		Shape sh = new Shape(3);
		
		System.out.println("Siva: "+sh.siva);
	}
	
	
}