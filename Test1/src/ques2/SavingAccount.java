package ques2;

public class SavingAccount extends Account {
	private final float interestRate;

	public SavingAccount() {
		interestRate = 5;
	}
	
	public SavingAccount(Owner owner, float balance, String nic, float interestRate) {
		super(owner, balance, nic);
		this.interestRate = interestRate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SavingsAccount [interestRate=").append(interestRate).append("]");
		return builder.toString();
	}
	
	public void print() {
		super.print();
		System.out.println(toString());
	}
	
	public float getInterest() {
		float interest = this.getBalance()*interestRate; 
		return interest;
	}
}
