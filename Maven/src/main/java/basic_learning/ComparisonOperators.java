package basic_learning;

public class ComparisonOperators {

	public static void main(String args[]){
		int a = 6; 
		int b = 5;
		boolean isEqual = (a == b);
	//Single equal assignment equality, double equal to equality/comparison.
		boolean isNotEqual = (a!=b);
		boolean greaterThan = (a>b);
		boolean lessThan = (a<b);
		boolean gtThanEq = (a>=b);
		boolean lsThanEq = (a<=b);
		
		System.out.println(a+ " isEqual "+b+" : "+isEqual);
		System.out.println(a+ " isNotEqual "+b+" : "+isNotEqual);
		System.out.println(a+ " greaterThan "+b+" : "+greaterThan);
		System.out.println(a+ " lessThan "+b+" : "+lessThan);
		System.out.println(a+ " gtThanEq "+b+" : "+gtThanEq);
		System.out.println(a+ " lsThanEq "+b+" : "+lsThanEq);
		
		boolean orOperator = (true || false);
		// we are using double characters like || and && instead of | and & because
		// when we are comparing three things, then it wont be comparing first two then result with third
		// it will compare all three and give the result when we use double characters
		
		boolean andOperator = (true && false);
		boolean notOperator = !(true);
		
		System.out.println("Result of operator is : "+orOperator);
		System.out.println("Result of operator is : "+andOperator);
		System.out.println("Result of operator is : "+notOperator);
	}
}
