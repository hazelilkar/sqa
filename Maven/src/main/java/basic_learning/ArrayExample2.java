
//Write a method which takes a parameter of array of String and print all the items in array

package basic_learning;

public class ArrayExample2 {

	public static void main(String args[]){

		String [] StringArray=new String[]{"hazel" , "umut" , "tilbe"};

		StringArrayMethod( StringArray);

	}


	public static void StringArrayMethod (String [] inputArr2)
	{
		String items = "";
		for(int i=0; i<inputArr2.length; i++){
			items += inputArr2[i]+",";
		}
		// For new line.
		System.out.println();
		System.out.println("\nValues of string array are: "+items);

	}
}
