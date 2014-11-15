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

public class EmployerCaller {

	public static void main(String args[]){
		Employer emp1 = new Employer();
		Employer emp2 = new Employer("Female", 28, "Hazel", 1384096, 2);
		
		emp1.setGender("Male");
		emp1.setAge(29);
		emp1.setName("Maninder");
		emp1.setIdNum(8767676);
		emp1.setExprYr(2);
		
		String gender = emp1.getGender();
		int age = emp1.getAge();
		String name = emp1.getName();
		int idNum = emp1.getIdNum();
		int exprYr = emp1.getExprYr();
		
		String gender2 = emp2.getGender();
		int age2 = emp2.getAge();
		String name2 = emp2.getName();
		int idNum2 = emp2.getIdNum();
		int exprYr2 = emp2.getExprYr();
		
		System.out.println("Employer 1 information: "+ name +" "+ age +" "+ gender +" "+ idNum +" "+ exprYr);
		System.out.println("Employer 2 information: "+ name2 +" "+ age2+" " + gender2 + " "+ idNum2+" " +exprYr2);
	}
	
}
