package sqa_learning.classObject;

public class PersonConstructor {

		private String name;
		private int age;
		private String ssn;
		String firstname;
		String lastname;

		// Defining the constructor. Name of method should be same as name of your class.
		// There should not be any return type, not even void.
		// Every object will have one constructor. Whenever you create an object, by default constructor will be added and called.
		// If we wouldn't define the constructor below, it would add default constructor -->"PersonConstructor(){}"
		public PersonConstructor(String name, int age, String ssn){
		this.name = name;
		this.age = age;
		this.ssn =ssn;	
		
		}
		
		public PersonConstructor(String Localfirstname, String Locallastname){
			// this. used with only class variables.
			// class variable - local variable
			this.firstname = Localfirstname;
			this.lastname = Locallastname;
			this.name = Localfirstname + "" +Locallastname;
			}
		
		//This is an example of a function/instance method/behavior of class.
		public void printName(){
			System.out.println("My name is: "+name);
		}
		
		public static void main(String args[]){
			// String str = new String("abc");  Assigned values to personObject, as we assigned in string. Create and assign.
			PersonConstructor personObject = new PersonConstructor ("Maninder",29, "243-432-432");
			personObject.printName();
			System.out.println("Age is :"+personObject.age);
			System.out.println("Ssn is :"+personObject.ssn);
		
			PersonConstructor personObject2 = new PersonConstructor ("Hazel",28, "998-8989");
			personObject2.printName();
			System.out.println("Age is :"+personObject2.age);
			System.out.println("Ssn is :"+personObject2.ssn);
		}
	}

