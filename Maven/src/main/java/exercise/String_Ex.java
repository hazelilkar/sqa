package exercise;

/*
 *  Compare 2 and 3, 2 and 4, 2 and 5, 3 and 4, 3 
		and 5, 4 and 5 using “=” operator and also 
		using “equal” operator
 */

public class String_Ex {

	public static void main(String args[]){
		//2
		String str = new String ("abc"); 
		//3
		String test = "abc"; 
		//4
		String test1 = "abc"; 
		//5
		String test2 = new String("abc"); 
	
		// Comparing 2 and 3
		System.out.println("Comparing references of 2 and 3 : "+str==test);
		System.out.println("Testing value equality for 2 and 3 : "+str.equals(test));
		
		// Comparing 2 and 4
		System.out.println("Comparing references of 2 and 4 : "+str==test1);
		System.out.println("Testing value equality 2 and 4 : "+str.equals(test1));
		
		// Comparing 3 and 4
		System.out.println("Comparing references of 3 and 4 : "+test==test1);
		System.out.println("Testing value equality 3 and 4 : "+test.equals(test1));
		
		// Comparing 3 and 5
		System.out.println("Comparing references of 3 and 5 : "+test==test2);
		System.out.println("Testing value equality for 3 and 5 : "+test.equals(test2));
		
		// Comparing 4 and 5
		System.out.println("Comparing references of 4 and 5 : "+test1==test2);
		System.out.println("Testing value equality for 4 and 5 : "+test1.equals(test2));
		
	}
}
