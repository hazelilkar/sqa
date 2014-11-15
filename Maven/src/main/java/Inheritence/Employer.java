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

public class Employer extends Person{

	private int IdNum;
	private int exprYr;
	
	public Employer (){
		System.out.println("This is the Employer Child Default Constructor");
	}
	
	public Employer(String gender, int age, String name, int IdNum, int exprYr){
		super(gender, age, name);
		this.IdNum = IdNum;
		this.exprYr = exprYr;
		System.out.println("This is the Employer Child Overloaded Constructor");
	}

	public int getIdNum() {
		return IdNum;
	}

	public int getExprYr() {
		return exprYr;
	}

	public void setIdNum(int idNum) {
		IdNum = idNum;
	}

	public void setExprYr(int exprYr) {
		this.exprYr = exprYr;
	}
	
}
