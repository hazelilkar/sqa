//Sum (Loop): Write a program called 
//Sum to produce the sum of 1, 2, 3, ..., to an 
//upper bound limit of 2000; 

package sqa_learning.Homeworks;

public class Sum_HW {

	public static void main(String args[]){
		
		int sum = 0; 
		
		for (int i=1; i<=2000; i++){
			sum = sum +i;
		}
		
		System.out.println("Sum of 2000 numbers are: " +sum);
	}
}

