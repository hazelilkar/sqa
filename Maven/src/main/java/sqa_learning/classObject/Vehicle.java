//Exercise 8 : Create a vehicle class. Properties : String color, int make and String model. 
//Write a default and overloaded constructor that initializes these properties. 
//Write a main method that creates the object by passing these values. 
//Print the values of the properties after the object is created.

package sqa_learning.classObject;

public class Vehicle {

	private String color;
	private int make;
	private String model;
	
	public Vehicle (){
		
		System.out.println("This is a default constructor");
	}
	public Vehicle (String color, int make, String model){
		
		System.out.println("This is a loaded constructor");
		this.color = color;
		this.make = make;
		this.model = model;
	}
	public void printName(){
		
		System.out.println("My car's identity: "+make +" " +model +" "+color);
	}
	public static void main(String args[]){
		
		Vehicle vehicleObject = new Vehicle("Red", 2013, "BMW");
		vehicleObject.printName();	
		Vehicle vehicleObject1 = new Vehicle();
	}
}
