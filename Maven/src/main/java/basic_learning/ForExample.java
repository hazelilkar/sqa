package basic_learning;

public class ForExample {
	
	public static void main(String args[]){
		
		int[] intArr = new int []{1,2,3,4,5,6,7,8,9,10};
		// Array is an object. So whenever you need to create an object, you need to use "new".
		
		System.out.println("Incrementing for loop******");
		for(int i=0; i<10; i++){
			System.out.println("Value of i is: "+i);
		}
		
		System.out.println("Decrementing for loop******");
		for(int j=10; j>0; j--){
			System.out.println("Value of i is: "+j);
		}
		
		System.out.println("For each loop******");
		for(int arrValue : intArr){
			System.out.println("Value of array element is : " +arrValue);
		}
		
		String[] nameArr = new String[]{"india", "usa", "russia", "japan"};
		for (String countryName: nameArr){
	//Takes the first element from nameArr and puts on countryName, every time loop goes, it updates the countryName.
			System.out.println("Name of the country is : "+countryName);
		}
		
}
}