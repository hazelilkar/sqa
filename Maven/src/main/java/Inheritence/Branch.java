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

public class Branch extends Bank {

	private String branchName;
	private String branchAddress;
	
	public Branch(String bankAddress, int totalEmployees, double balance, String branchName,
			String branchAddress) {
		super(bankAddress, totalEmployees, balance);
		this.branchName = branchName;
		this.branchAddress = branchAddress;
	}

	public Branch() {
	}

	@Override
	public double withdrawMoney(double y) {
		System.out.println("Made withdraw from Branch. New balance: "+(this.getBalance()-y));
		return this.getBalance() - y;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getBranchAddress() {
		return branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}
	
}
	

