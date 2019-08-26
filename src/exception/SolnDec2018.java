package exception;

public class SolnDec2018 {

	public static void main(String[] args) {
		// ans of 2b)
		try {
			BankAccount b = new BankAccount(500);
		} catch (NegativeValue e) {
			System.out.println(e.getMessage());
		}
	}
}

class NegativeValue extends Exception {

	//ans of 1
	public NegativeValue() {
		super("Exception: Negative Value");
	}

	public NegativeValue(double value) {
		super("Exception: Negative Value: " + value);
	}
}

class BankAccount {

	double balance;

	public BankAccount() {
		this.balance = 0.0;
	}

	// ans of 2a
	public BankAccount(double balance) throws NegativeValue {
		if (balance < 0) {
			throw new NegativeValue(balance);
		}
		this.balance = balance;
	}

}
