/*
 * Rules for interface:
 * i) interface is a keyword
 * ii) All member variables are public static final by default. i.e. if you have
 * any variable, you to have to provide a value
 * iii) All the method / functions are public abstract by default. You only have to provide
 * a) return
 * b) name of the method
 * c) parameter list if applicable
 * for ex. String myMethod(int number);
 */

package Inheritence;

public interface IBusiness {

	// Why they are static by default? Because, non static is in object level and static is in class level.
	// Since we dont have objects (interface doesnt let us create object), we have to access them by classes and it has to be static.
	// By Default it is: public static and final because defined in interface.
	// public static final String CURRENCY = "USD";
	String CURRENCY = "USD";
	
	// By Default methods are abstract.
	// abstract boolean isOpen();
	boolean isOpen();
	int getCapacity();
	String getContactInfo();
	
}
