package exception;

public class Soln2018Sept {

	public static void main(String[] args) {
		CheckingAccount check = new CheckingAccount(200.0, 500.0);
		try {
			check.withdraw(150.00);
			check.withdraw(470.00);
		} catch (OverDraftException e) {
			System.out.println("Exception: " + e.getMessage() + "Deficit: " + e.getDeficit());
		}

	}
}

class Account {
	protected double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdrawl(double amt) {
		balance -= amt;
	}
}

class CheckingAccount extends Account {
	private double overdraftAmount;

	public CheckingAccount() {
		super(0.0);
		overdraftAmount = 0.0;
	}

	public CheckingAccount(double balance, double overdraftAmount) {
		super(balance);
		this.overdraftAmount = overdraftAmount;
	}

	/*
	 * public void withdraw(double amt) { double overdraftNeeded; if(balance<amt) {
	 * overdraftNeeded=amt-balance; if(overdraftAmount<overdraftNeeded) {
	 * System.out.println("Transaction failed"); }else { balance=0.0;
	 * overdraftAmount-=overdraftNeeded;
	 * 
	 * } }else { balance-=amt; }
	 * 
	 * }
	 */

	// solution for 3b
	public void withdraw(double amt) throws OverDraftException {
		double overdraftNeeded;
		if (balance < amt) {
			overdraftNeeded = amt - balance;
			if (overdraftAmount < overdraftNeeded) {
				throw new OverDraftException("Insufficient overdraft amount", overdraftNeeded);
			} else {
				balance = 0.0;
				overdraftAmount -= overdraftNeeded;

			}
		} else {
			balance -= amt;
		}

	}
}

class OverDraftException extends Exception {
	private double DEFICIT;

	public OverDraftException(String msg, double deficit) {
		super(msg);
		DEFICIT = deficit;
	}

	public double getDeficit() {
		return DEFICIT;
	}

}