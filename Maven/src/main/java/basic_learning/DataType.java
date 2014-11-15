package basic_learning;

public class DataType {
	public static void main(String args[]){
// String is a class in java. These below examples are primitive data types. String is not a primitive data type.
		char varChar = 'a';
// if it is one character you use --> '' 
// if it is more than one character then it becomes string and you use --> ""
		boolean varBoolean = false;
		byte varByte = 127;
		short varShort = 12;
		int varInt = 4;
		long varLong =244312;
		float varFloat = 5.0f;
		double varDouble = 543/34;
		
		String stringPart1 = "Value of ";
		String stringPart2 = "is: ";
		
		
		System.out.println("Value of char is: "+varChar);
		System.out.println(stringPart1+ "char " +stringPart2 +varChar);
		
		System.out.println("Value of boolean is: "+varBoolean);
		System.out.println(stringPart1+ "boolean " +stringPart2 +varBoolean);
		
		System.out.println("Value of byte is: "+varByte);
		System.out.println("Value of short is: "+varShort);
		System.out.println("Value of integer is: "+varInt);
		System.out.println("Value of long is: "+varLong);
		System.out.println("Value of float is: "+varFloat);
		System.out.println("Value of double is: "+varDouble);
	}
}
