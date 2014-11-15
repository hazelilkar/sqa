package sqa_learning.Homeworks;

public class String2_HW {

	public static void main(String args[]){
		
		String[] arrc = new String[] {"US", "Turkey", "India", "Russia", "France"};
		PrintCountryName(arrc);
	}
	public static void PrintCountryName (String [] ctryNames){
		for (String ctryName : ctryNames){
			
		// We used string because we wanted to loop strings.	
		// ctryName is the variable that you will be storing the data and use for each "for loop"
		// ctryNames is the array where you will be retrieving your values and defined in function.
			
			if(ctryName.length()>3){ 
				// we added if part because since "US" doesnt have 3 characters, it was going to give an error.
			
			System.out.println(ctryName.substring(0,3));
		}
	}
}
}