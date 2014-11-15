package exercise;

public class VehicleCaller {

	public static void main (String args[]){
		Vehicle vehicle1 = new Vehicle();
		vehicle1.setColor("Black");
		vehicle1.setModel("Mercedes");
		vehicle1.setMake(2014);
		printProperties(vehicle1);
	}

	 private static void printProperties(Vehicle exerciseVehicle){
	        System.out.println("Color is : "+exerciseVehicle.getColor());
	        System.out.println("Model is : "+exerciseVehicle.getModel());
	        System.out.println("Make is : "+exerciseVehicle.getMake());
	        
}
}
