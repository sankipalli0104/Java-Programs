package  com.siva.ankipalli;
import com.siva.ankipalli.Vehicle;
import com.siva.Car;
public class Bike extends Car{
	protected int  numberOfTyres;
	
	
	public Bike(String type, String tyres, String colour, int speed, int numberofSeats, int numberofgears, int numberOfTyres){
		this();
		//super(type, tyres, colour, speed, numberofSeats,numberofgears);
		this.numberOfTyres = numberOfTyres;
		this();
	}
	public  void printBikeDetails(){
		System.out.println(" BIKE Number of Tyre "+numberOfTyres);
	}
	
	public static void main(String ... str){
		Bike bike= new Bike("Honda","MRF", "RED",120,4,6, 2);
		String carDis = bike.printCarDetails();
		
		System.out.println("Car Details: "+carDis);
		String superClass = bike.printDetails();
		System.out.println("CAR DETAILS: "+superClass);
		bike.printBikeDetails();
	}
}