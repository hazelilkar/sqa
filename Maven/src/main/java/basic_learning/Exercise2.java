//Write a  java program which print a counting  from 1 to 100
//Use Java loops.
//
//
//
//Write a  java program which prints  all  even number from 1 to 100
//Use Java loops
//Use % operator to check if a number is even or not.


package basic_learning;

public class Exercise2 {

	public static void main(String args[]){
		for (int i=1; i<=100; i++){
			 if( i % 2 == 0){
                 System.out.println("Print Even Numbers: "+i);
			 }
		}
	}
}
