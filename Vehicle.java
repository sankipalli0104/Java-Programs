package com.siva.ankipalli;

public class Vehicle {
	private String type;
	private String tyres;
	private String colour;
	private String brand;
	public static String model = "model";
	int speed; 
	public Vehicle(String type, String tyres, String colour, int speed) {
		this.type = type;
		this.tyres = tyres;
		this.colour = colour;
		this.speed = speed;
	}
	
	public String printDetails(){
		return "Type: "+type+" Tyres: "+tyres+" Colour: "+colour +" Speed: "+speed;
	}
	public static void methodOverride(){
		System.out.println("Super Class MethodeOverride:"+model);
	}
	 
}