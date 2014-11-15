//
//[11/1/14, 11:07:28 AM] Prashant Nagar: Write a java program that has 3 string variables:
//1)	Soccer
//2)	Football
//3)	Cricket
//“Soccer” and “Cricket” are a string literal, “Football” is java object.
//
//a)	Compare 1 with 2, 1 with 3 and 2 with 3 for equality and memory address.
//b)	Print out the total characters in 2.
//c)	Print second last character from 3
//d)	Print the position of first “c” in 1.

package basic_learning;

public class StringExercise {

	public static void main(String args[]){
		
	String Soccer = "Soccer";
	String Football = new String ("Football");
	String Cricket = "Cricket";
	
	
	System.out.println("Compare Soccer and Football references : "+(Soccer == Football));
	System.out.println("Compare Soccer and Cricket references : "+(Soccer == Cricket));
	System.out.println("Compare Cricket and Football references : "+(Cricket == Football));
	

	System.out.println("Compare Soccer and Football equality: "+Soccer.equals(Football));
	System.out.println("Compare Soccer and Cricket equality : "+Soccer.equals(Cricket));
	System.out.println("Compare Cricket and Football equality : "+Cricket.equals(Football));
	
	System.out.println("Print all charachters in Football : "+Football.length());
	System.out.println("Print second last charachter of Cricket : " +Cricket.charAt((Cricket.length()-2)));
	System.out.println("Print the position of first 'c' in Soccer : "+Soccer.indexOf("c"));
	}
	
}
