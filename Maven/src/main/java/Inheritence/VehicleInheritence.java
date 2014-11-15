package Inheritence;

public class VehicleInheritence {

	private int maxSpeed;
	private String color;
	private String model;
	public String source = "Vehicle";

	public VehicleInheritence (){
		System.out.println("This is from VehicleInheritence constructor");
	}
	
	public VehicleInheritence (int maxSpeed, String color, String model){
		this.maxSpeed = maxSpeed;
		this.color = color;
		this.model = model;
	}
	
	public void run(){
		System.out.println("My car is running");
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

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

}

