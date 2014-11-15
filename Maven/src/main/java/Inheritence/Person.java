//Exercise 12: 
// Create a Person Class with gender, age and 
//name. 
// Create a Employee Class with IdNum, exprYr. 
//Define a default and overloaded constructor 
//for Person class and Employee Class. 
//• Write a Employee class caller. Create 2 objects 
//one without any arguments and other with 
//setting all the properties. 
//• Print out all the properties for both the 
//objects. 

package Inheritence;

public class Person {
	private String gender;
	private int age;
	private String name;
	
	public Person(){
		System.out.println("This is the Person Parent Constructor");
	}
	
	public Person (String gender, int age, String name){
		System.out.println("This is the Parent Child Overloaded Constructor");
		this.gender = gender;
		this.age = age;
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}


