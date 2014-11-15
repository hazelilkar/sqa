//Define a function that accepts two int
//variables and returns the multiplication value of 
//that. Call this function from the main method and 
//print the return value. 

package sqa_learning.Homeworks;

public class Multiplication_HW {
	public static void main(String args[]){
	
	multiplication(3,10);
	
}
	public static void multiplication(int a, int b){
		int m = (a*b);
		System.out.println("Multiplication result is: "+m);
	}
}