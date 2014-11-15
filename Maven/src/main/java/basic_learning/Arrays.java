package basic_learning;

public class Arrays {
	public static void main(String args[]){
		String s = new String("Test");
		
		// 3 is the size of array.
		// For array there is no literal. Every time it creates a new object and allocates memory.
		int [] intArr = new int [3];
		intArr[0] = 32;
		intArr[1] = 54;
		intArr[2] = 23;
		
		int secondArr = intArr[1];
		
		// Read the individual array elements
		System.out.println("Value of first index is: "+intArr[0]);
		System.out.println("Value of first index is: "+secondArr);
		
		// Read the array elements' value and index through loop.
		for(int i=0; i<intArr.length; i++){
			System.out.println("Value at :" +i+ " index is : "+intArr[i]);
		}
		
		//another way to define, instantiate and initialize the array
		// Element of the array is integer below.
		int[] anotherIntArr = new int []{90,23,76};
		
		// Element of the array is array below.
		// int [][] num = new int [5][4];
		
		//populate the array using for loop
		// In below, we override the value of arrays. It was 90,23 and 76 before and now it became 10,11,12.
		for(int i =0; i<anotherIntArr.length; i++){
			anotherIntArr[i] = i+10;
			System.out.println("Value of another array: "+anotherIntArr[i]);
		}
	}
	
}
