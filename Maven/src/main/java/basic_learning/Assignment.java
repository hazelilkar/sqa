package basic_learning;

public class Assignment {

	public static void main(String args[]){
		float x = 1.4f;
		float y = 2.3f;
		
		boolean isEqual = (x==y);
		boolean isNotEqual = (x!=y);
		boolean greaterThan = (x>y);
		boolean lessThan = (x<y);
		
		System.out.println(x+ " isEqual "+y+" : "+isEqual);
		System.out.println(x+ " isNotEqual "+y+" : "+isNotEqual );
		System.out.println(x+ " greaterThan " +y+ " : "+greaterThan);
		System.out.println(x+ " lessThan "+y+ " : "+lessThan);
	
	}
	
}
