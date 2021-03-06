package Inheritence.Interface;
/* Exercise 14: 
• Create an interface FlyingObject 
• Declare the property maxSpeed, maxAltitude. 
• Declare the methods of flying object takeOff(), 
land(), capacity(), flyHigh() 
• Create 2 classes which implements the 
Interface.   Caller should create the objects of both the 
classes. Caller should call a “operate” method 
that should keep on calling flyHigh() method 
till maxAltitude is not reached. Once 
maxAltitude is reached, land() method should 
be called. 
 */

public class FlyingObjectCaller {

	public static void main (String args[]){
		FlyingObject obj1 = new FlyingObject1();
		FlyingObject obj2 = new FlyingObject2(); 
		System.out.println("Flying Chopper now...");
		operate(obj1);
		System.out.println("Flying Plane now...");
		operate(obj2);
	}
	
	public static void operate(FlyingObject obj){
		while (true){
			 if(obj.currentAttitude() < FlyingObject.maxAttitude){
			// Overridden methods will be called by objects.
			// First it will call Chopper object = FlyingObject1
			// Second time it will call Plane object = FlyingObject2
	                obj.flyHigh();
	            }else{
	                obj.land();
	                break;
	            }			
		}
	}
}
