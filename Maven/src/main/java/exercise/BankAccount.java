//Exercise 11: Write a BankAccount class. It should 
//have actHolderName, accountNumber, 
//initialAmount properties. 
//accountNumber should get incremented and 
//assigned automatically to the object every time 
//when a BankAccount object is created. Create 
//BankAccountCaller class. Create 5 BankAccount 
//objects and print accountNumber for every object. 


package exercise;

public class BankAccount {

	private String actHolderName;
	private int accNum;
	private Double initialAmount;
	
	private static int incrementAccount;
	
	public BankAccount(String actHolderName, double initialAmount){
		// We use "this" bc we defined two variables which have SAMENAME one is in class level and one in method level(local).
		// So when we use this, it understands that is class level variable.
		// If we don't use this, then it is using local variable by default, not the class level variable.
		this.actHolderName = actHolderName;
		this.initialAmount = initialAmount;
		// This is a static integer which will be shared across all objects.
		// Every time constructor will be called, this value will be incremented by 1.
		incrementAccount++;
		// Since we did not define local variable same name as accNum, then in here we don't need to use "this".
		accNum = incrementAccount;
		// Shortcut: accNum = incrementAccount++;
	}

	public String getActHolderName() {
		return actHolderName;
	}

	public void setActHolderName(String actHolderName) {
		this.actHolderName = actHolderName;
	}

	public int getAccNum() {
		return accNum;
	}

	public Double getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(Double initialAmount) {
		this.initialAmount = initialAmount;
	}
	
}
