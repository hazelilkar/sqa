package basic_learning;

public class WhileExample {

	public static void main(String args[]){
		
		int i = 0;
	// THIS IS WHILE EXAMPLE. 
		//First checking the condition then do the job.
		while(i<10){
			System.out.println("Value of i is: "+i);
			i++;
		}
		
		//while (!pageLoad){
			// do some task
			// if (not equal true)
			//break;
			// example, when page is loading show the processing icon. 
			// if time is more than 10 minutes
		// break;
	//THIS IS DO WHILE EXAMPLE
		// In do while, first statement is always executed unconditionally.
	do {
		System.out.println("Value of i is: "+i);
		i++;
	
	} while (i<10);
}
}

