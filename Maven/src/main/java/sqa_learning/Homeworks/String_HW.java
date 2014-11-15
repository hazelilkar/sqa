// Define a function that accepts a String 
//array and print only first 3 characters of every 
//string value. Call this function from the main 
//method and pass a String array that has name of 
//any 5 countries. 

package sqa_learning.Homeworks;

public class String_HW {

	public static void main(String args[]){
		String[] arrc = new String[] {" USA", "Turkey", "India", "Russia", "France"};
		function(arrc);
	}
	public static void function(String arr[]){
		for(int i=0; i<arr.length; i++){
			System.out.println("First three chars of countries: "+arr[i].trim().substring(0, 3).toLowerCase());	
		
		//doing trim() first or later is important. Also it only applies for beginning or end spaces. 
		//Middle spaces are not getting trimmed.
		//when its used first then it will trim the space first then count first three characters.
		// When its used after substring then it will take 3 char 1st then trim and result will be:us without space.
	}
  }
}
