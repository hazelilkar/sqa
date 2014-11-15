package basic_learning;

public class Different_Variables {

	static String classVar = "I'm a class variable";
	
	//It doesn't belong to any method/function. (Method and function are same)
	// It can be used inside the class in any method. Don't need to define again and again.
	// Since we are planning to use this variable inside the static methods,
	//we need to define the class variable as static.
	
	
	public static void main(String args[]){
		String methodVar = "I am a method variable";
		System.out.println(classVar+" main");
		System.out.println(methodVar);
	}
	
}
