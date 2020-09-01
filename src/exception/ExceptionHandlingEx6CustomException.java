package exception;

public class ExceptionHandlingEx6CustomException {
	public static void main(String[] args) throws Exception {
		BankAccount1 acc = new BankAccount1(400);
	}
}

class NegativeStartingBalance extends Exception {
	public NegativeStartingBalance() {
		super("Error: Negative starting balance");
	}

	public NegativeStartingBalance(double amount) {
		super("Error: Negative starting balance: " + amount);
	}
}

class BankAccount1 {
	private double balance;

	public BankAccount1(double startBalance) throws NegativeStartingBalance {
		if (startBalance < 0)
			throw new NegativeStartingBalance(startBalance);
		balance = startBalance;
	}

}