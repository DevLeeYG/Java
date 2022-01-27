package helloworld;

class BankAccount{
	String name;
	double balance;
	static int count;
	
	
	BankAccount(String name, double balance){
		this.name = name;
		this.balance = balance;
		count++;
	}
	
}



public class Code110 {
	
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount("Alice", 100000);
		BankAccount ba2 = new BankAccount("paul", 50000);
		
		System.out.println("number of accounts: " + BankAccount.count);
		
	}

}
