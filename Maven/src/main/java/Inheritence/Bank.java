//Write a Bank class that will have a bank name 
//properties which is shared across all the 
//object. Value of these properties is “MyBank”. 
// Bank class will have these properties: 
//o Bank address 
//o totalEmployees 
// Bank class has these function 
//o makeDeposit 
//o withdrawMoney 
// Branch class extends Bank class, it has these 
//properties : Brach Name, Branch address 
// Branch class overrides the withdrawMoney 
//function and provides its own 
//implementation. 
// Write a caller class that creates the object of 
//branch and access all the properties and call 
//all the methods.

package Inheritence;

public class Bank {
	
	private static String bankName = "MyBank";
	private String bankAddress;
	private int totalEmployees;
	private double balance;
	
	
	public Bank(String bankAddress, int totalEmployees, double balance) {
		this.bankAddress = bankAddress;
		this.totalEmployees = totalEmployees;
		this.balance = balance;
	}
	
	public Bank() {
	}
	
	public double makeDeposit(double x) {
		System.out.println("Made deposit to Bank. New balance:  "+(balance+x));
		return balance + x;
	}
	
	public double withdrawMoney (double y) {
		System.out.println("Made withdrawl from Bank. New balance: "+(balance-y-0.1));
		return balance - y - 0.1;
	}

	public String getBankName() {
		return bankName;
	}
	
	public String getBankAddress() {
		return bankAddress;
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	public int getTotalEmployees() {
		return totalEmployees;
	}

	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	
}