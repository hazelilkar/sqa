package Inheritence.Interface;

public class FlyingObject1 implements FlyingObject{

	private int currentAlt;
	
	public FlyingObject1() {
	}
	//@Override
	public void takeOff(){
		System.out.println("Chopper is taking off");
	}
	//@Override
	public void land(){
		System.out.println("Chopper is landing");
	}
	//@Override
	public int Capacity(){
		return 100;
	}
	//@Override
	public int flyHigh(){
		currentAlt +=2000;
		System.out.println("Chopper is flying at: "+currentAlt+ " now");
		return currentAlt;
	}
	//@Override
	public int currentAttitude() {
		return currentAlt;
	}
}
