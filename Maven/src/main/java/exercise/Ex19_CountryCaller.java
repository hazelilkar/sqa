package exercise;

public class Ex19_CountryCaller {

	public static void main(String[] args) {
		
			Ex19_Country c1 = new Ex19_Country ("Cnd", "Canada", 35000L, "Canadian Dollar");
			Ex19_Country c2 = new Ex19_Country ("Cnd", "Canada", 35000L, "Canadian Dollar");
			
			Ex19_Country c3 = new Ex19_Country ("USA", "America", 95000L, "Dollar");
			Ex19_Country c4 = new Ex19_Country ("USA", "America", 95000L, "Dollar");
			
			Ex19_Country c5 = new Ex19_Country ("Itl", "Italy", 55000L, "Euro");
			Ex19_Country c6 = new Ex19_Country ("Itl", "Italy", 55000L, "Euro");
			
			Ex19_Country c7 = new Ex19_Country ("Spn", "Spain", 65000L, "Euro");
			Ex19_Country c8 = new Ex19_Country ("Spn", "Spain", 65000L, "Euro");
			
			Ex19_Country c9 = new Ex19_Country ("Eng", "England", 75000L, "Pound");
			Ex19_Country c10 = new Ex19_Country ("Eng", "England", 75000L, "Pound");
	
			// Comparing c1 and c2
			System.out.println("Comparing references of c1 and c2 : "+(c1==c2));
			System.out.println("Testing value equality for c1 and c2 : "+c1.equals(c2));
			
			// Comparing c3 and c4
			System.out.println("Comparing references of c3 and c4 : "+(c3==c4));
			System.out.println("Testing value equality for c3 and c4 : "+c3.equals(c4));
			
			// Comparing c5 and c6
			System.out.println("Comparing references of c5 and c6 : "+(c5==c6));
			System.out.println("Testing value equality for c5 and c6 : "+c5.equals(c6));
	
			// Comparing c7 and c8
			System.out.println("Comparing references of c7 and c8 : "+(c7==c8));
			System.out.println("Testing value equality for c7 and c8 : "+c7.equals(c8));
			
			// Comparing c9 and c10
			System.out.println("Comparing references of c9 and c10 : "+(c9==c10));
			System.out.println("Testing value equality for c9 and c10 : "+c9.equals(c10));
	}

}
