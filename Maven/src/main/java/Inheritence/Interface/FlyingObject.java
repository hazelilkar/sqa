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

public interface FlyingObject {

	int maxSpeed = 400;
	int maxAttitude = 20000;
	
	void takeOff();
	void land();
	int Capacity();
	int flyHigh();
	int currentAttitude();
}
