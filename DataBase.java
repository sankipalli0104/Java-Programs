package com.apple.store.database;
//import com.apple.store.service.Service;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DataBase {
	int intValue;
	
	public DataBase(int intValue){
		this.intValue = intValue;
		
	}
	
	public void disp(){
		System.out.println("printing  int value"+intValue);
	}
	
	
	/*public static void main(String atr[]) throws IOException{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.print("Please Enter the value of int : ");
		
		
		//Service sr  = Service.getInstance(20);
		//sr.intValue = 25;
		
		//sr.intValue = Integer.parseInt(br.readLine());
		//sr.intValue = 20;
		
		sr.methodTest();*/
	//}
}