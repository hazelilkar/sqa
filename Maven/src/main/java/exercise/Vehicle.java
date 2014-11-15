//Create a class Vehicle
//Define attributes of the Vehicle class (color, model, make)
//Define methods in a Class (getter and setter)
//Create an object of a class in separate class (VehicleCaller)
//Set the object properties by calling object setter
//Invoke the main method and print properties using getter

package exercise;

public class Vehicle {

	// By defining our properties as private, we are "encapsulate" our properties.
	// Our member variables are not reachable by any other class. We can only use methods and get/set them.
	private String color;
	private String model;
	private int make;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMake() {
		return make;
	}

	public void setMake(int make) {
		this.make = make;
	}
}
