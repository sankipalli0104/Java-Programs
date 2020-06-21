package com.siva;
import com.siva.ankipalli.Vehicle;
public class Car extends Vehicle{
	public static int numberofSeats;
	public static int numberofgears = 4;
	public Car(String type, String tyres, String colour, int speed, int numberofSeats){
		super(type, tyres, colour, speed);
		this.numberofSeats = numberofSeats;
		//this.numberofgears = numberofgears;
	}
	
	public static String printCarDetails(){
		return "Number Of Seats: "+numberofSeats+" Number of gears: "+numberofgears;
	}
	public static void methodOverride(){
		System.out.println("Child Class MethodeOverride:");
	} 
}