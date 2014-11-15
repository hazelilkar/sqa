package basic_learning;

public class StringExample {

	public static void main(String args[]){
		
		String str1 = "Test1";
		// Above line, string literal is created. When we dont use "new" word like below, then it shares the same string.
		// It uses the pool memory. String pool. 
		//If the value exists in pool, uses that value, otherwise creates new object.
		// But if we use new then regardless of value exits in pool or not, it creates new object.
		
		String str2 = new String ("Test1");
		// Above line, we created new class. Whenever we use "new" keyword, it allocates the memory.
		
		String str3 = str1 + str2;
// Strings are immutable properties (object). Once you created you cannot change the value of the object.
		String str4 = "Test1";
		
		System.out.println("Comparing references of str1 and str2 : "+str1==str2);
		// For the objects, double equality compares the memory address of objects. 
		//  == -> It doesn't compare the value of objects, it compares references of objects.
		// For primitive values, == -> compares values. (For primitives, not for objects)
		System.out.println("Comparing values of str1 and str2 : "+str1.equals(str2));
		// .equals compares the value of the strings. Strings only.
		
		System.out.println("Testing string pool for str1 and str4 : "+(str1==str4));
		System.out.println("Testing value equality for str1 and str4 : "+str1.equals(str4));
		
		System.out.println("Testing string pool for str1 and str4 : "+ str1==str4);
		// When you compare the above without the bracelets like (str1 == str4), then it is first adds
		// str1 and "..." and creates new string. Then it compares that new string's address with str4 and returns false.
		
	}
}
