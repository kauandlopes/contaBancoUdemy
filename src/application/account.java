package application;

public class account {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public double getBalance() {
		return balance;
	}
	
	//deposito
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			}
	}
	
	//saque
	public void withdraw(double amount) {
		if (amount > 0 ) {
			balance -= (amount + 5); 
			} 
		else {
			System.out.println("Saldo insuficiente!");
		}
	}
	
	public String toString() {
		return "\n"
				+ "Account Data:\n"
				+ "Account: " 
				+ accountNumber
				+ ", Holder: " 
				+ accountHolder 
				+ " Balance: " 
				+ balance
				+ String.format("%.0f", balance)
				+ "\n";
	
	      
	}
}