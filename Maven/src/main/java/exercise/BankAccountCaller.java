package exercise;

public class BankAccountCaller {

	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("Hazel", 100.10);
		BankAccount ba2 = new BankAccount("Umut", 15.60);
		BankAccount ba3 = new BankAccount("Tilbe", 10.40);
		BankAccount ba4 = new BankAccount("Ozlem", 110.30);
		BankAccount ba5 = new BankAccount("Necdet", 1000.20);
		
		System.out.println("1st Account Number: " +ba1.getAccNum());
		System.out.println("2nd Account Number: "+ba2.getAccNum());
		System.out.println("3rd Account Number: "+ba3.getAccNum());
		System.out.println("4th Account Number: "+ba4.getAccNum());
		System.out.println("5th Account Number: "+ba5.getAccNum());
	}

}
