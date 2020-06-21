public class Square extends Shape{
	int siva = 20;
	Square(double length){
		super(length);
	}
	public void area(){
		System.out.println("Area of Square: "+(length*length));
	}
}