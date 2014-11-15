package exercise;

public class CalculatorCaller {

	public static void main(String[] args) {

		//Calling directly the method within the sysout
		System.out.println("Result of add function: "+ (Calculator.add(2, 2)) );
		
		int sub = Calculator.sub(6,4);
		System.out.println("Result of sub function: " +sub);
		
		System.out.println("Result of div function: "+ (Calculator.div(12, 3)) );
		
		System.out.println("Result of mul function: "+ (Calculator.mul(12, 2)) );
	
	}
}
