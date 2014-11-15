//Exercise 10: Write a Calculator class. It provides 4 
//methods. Add, subtract, multiply and divide. 
//All the methods take two integer parameter and 
//performs the respective operation and returns the 
//result. Write a CalculatorCaller class. Call the add, 
//subtract, multiply and divide methods and print 
//the result values without creating the object of 
//Calculator class. 

package exercise;

public class Calculator {

	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	// Static always goes with class. It is a key word that attached with class.
	// Non static is attached with object.
	// Reason we made static methods bc we can now call them without creating objects.
	public static int add (int a, int b){
		return a+b;
	}
	public static int sub (int a, int b){
		return a-b;
	}
	public static int div (int a, int b){
		return a/b;
	}
	public static int mul (int a, int b){
		return a*b;
	}
}
