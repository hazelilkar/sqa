package sqa_learning.classObject;

public class Person {

// No main method.

	// Below are the properties/class variable/instance variable/member variable.
	private String name;
	private int age;
	private String ssn;

	//This is an example of a function/instance method/behavior of class.
	public void printName(){
		System.out.println("My name is: "+name);
	}
	
	
	public static void main(String args[]){
	// Creating a person object in here. By using new, memory allocation occurs.
	// Basically, it goes person class and checks what are the properties and how much memory a new "person" will need.
		Person personObject = new Person();
	  //String str = new String();
	  // str = "abc";	
	  // String str = new String("abc");
		personObject.name="Maninder";
		personObject.age = 29;
		personObject.ssn = "243-432-432";
		personObject.printName();
		System.out.println("Age is :"+personObject.age);
		System.out.println("Ssn is :"+personObject.ssn);
	
		Person personObject2 = new Person();
		personObject2.name="Hazel";
		personObject2.age = 28;
		personObject2.ssn = "998-8989";
		personObject2.printName();
		System.out.println("Age is :"+personObject2.age);
		System.out.println("Ssn is :"+personObject2.ssn);
	}
}
