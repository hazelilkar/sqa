package exercise;

public class Static_Ex {

	public static void main (String args []){
		Static_Ex obj1 = new Static_Ex ();
		// Calling static method from the non-static method. 
		// We don't have to create an object in order to call non static method here.
		obj1.PrintAdd();
		// Calling non static method from the static method. We HAVE TO create an object for this method.
		printName(); 

	}
	public Static_Ex(){}

	public static void printName (){

		// You cannot call non static method from a static method.
		// Cannot make a static reference to the non-static method getName() from the type Static_Ex
		// Static method is in class level, non static method is in object level.
		Static_Ex obj2 = new Static_Ex();
		System.out.println("My name is: "+obj2.getName());
	}
	public String getName() {
		return "fg";
	}

	public static String getAddress() {
		return "ghj";
	}

	public void PrintAdd (){
		//However, you can call static method from non-static method without even creating an object.
		System.out.println("My Address is: "+getAddress());
	}
}

