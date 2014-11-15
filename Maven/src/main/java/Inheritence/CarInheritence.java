package Inheritence;

public class CarInheritence extends VehicleInheritence {

	private int engineCap;
	private boolean isFourWheel;
	public String source = "Car";
	
	public CarInheritence(){
		// there is unwritten code in here: super();
		System.out.println("This is from CarInheritence constructor");
		this.engineCap = 3;
	}

	public CarInheritence (int engineCap, boolean isFourWheel, int maxSpeed, String color, String model){
		super (maxSpeed, color, model);
		this.engineCap = engineCap;
		this.isFourWheel = isFourWheel;
		System.out.println("This is from Car overloaded constructor");
	}
	
	@Override
	// Override is a comment and signature actually developers put to indicate this method is overriden in child class.
	// It exists in the parent class as well.
	public void run(){
		System.out.println("My car is running");
	}
	
	public static void main (String args[]){
		// Calling first child default constructor called then from there parent default constructor called.
		// super(); 
		 CarInheritence myCar2 = new CarInheritence();
		 CarInheritence myCar1 = new CarInheritence (5, true, 20, "blue", "Nisan");
		 String color = myCar1.getColor();
		 String model = myCar1.getModel();
		 int myCap = myCar1.getEngineCap();
		 System.out.println("Color is: "+color +" ,model is: "+model +" and engineCap is: "+myCap);
		 
		 myCar1.run();
		 
		 VehicleInheritence vh = new VehicleInheritence();
		 vh.run();
		 
		 // Overriden methods are always called from objects not from references.
		 VehicleInheritence car = new CarInheritence();
		 car.run();
		 //Overriden properties are always called from references not from objects
//		 String overridenProper = car.source;
//		 System.out.println(overridenProper);
		 System.out.println(car.source);
	
	}
	public int getEngineCap() {
		return engineCap;
	}

	public void setEngineCap(int engineCap) {
		this.engineCap = engineCap;
	}

	public boolean isFourWheel() {
		return isFourWheel;
	}

	public void setFourWheel(boolean isFourWheel) {
		this.isFourWheel = isFourWheel;
	}
	
}

