package ques2;

public class Account {

	private Owner owner;
	private float balance;
	private String number;

	public Account() {}

	public Account(Owner owner, float balance, String number) {
		this.owner = owner;
		this.balance = balance;
		this.number = number;
	}

	public Account(Account account) {
		this.owner = account.owner;
		this.balance = account.balance;
		this.number = account.number;
	}

	public void print() {
		owner.print();
		System.out.println(this.toString());
	}

	

	@Override
	public String toString() {
		return "Account [owner=" + owner + ", balance=" + balance + ", number=" + number + "]";
	}

	public void deposit(float amt) {
		this.balance += amt;
	}

	public void withdraw(float amt) {
		this.balance -= amt;
	}

	public float getBalance() {
		return balance;
		
	}


}

