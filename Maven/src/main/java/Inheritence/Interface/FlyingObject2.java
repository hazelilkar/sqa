package Inheritence.Interface;

public class FlyingObject2 implements FlyingObject {

	private int currentAlt = 0;
	
    public FlyingObject2(int maxSpeed, int maxAttitude) {
		
	}
    
	public FlyingObject2() {
		// TODO Auto-generated constructor stub
	}

	//@Override
	public void takeOff(){
		System.out.println("Plane is taking off");
	}
	//@Override
	public void land(){
		System.out.println("Plane is landing");
	}
	//@Override
	public int Capacity(){
		return 50;
	}
	//@Override
	public int flyHigh(){
		currentAlt += 10000;
		System.out.println("Plane is flying at: "+currentAlt+ " now");
		return currentAlt;
	}
	public int currentAttitude(){
		return currentAlt;
	}
}
