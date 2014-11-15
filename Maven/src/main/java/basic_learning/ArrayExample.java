package basic_learning;

public class ArrayExample {

	public static void main(String args[]){
		
		// Declare an array of char which takes 5 elements.
		char charArray[] = new char [5];
		
		
		// Declare an array of int and initialize element in the array
		int intArray[] = new int [2];
		intArray [0] = 12;
		intArray[1] = 13;
		
		// int[] intArray=new int[]{12, 13};
		
		System.out.println("Array list: " +intArray[0]);
		System.out.println("Array list: " +intArray[1]);
		
		
	IntArrayMethod(intArray);

	}	
	//Write a method which takes a parameter of array of int and print the size of any array.
		public static void IntArrayMethod (int[] inputArr)
		{
			System.out.println("Size of the array is: " +inputArr.length);
		}	
	}
	

