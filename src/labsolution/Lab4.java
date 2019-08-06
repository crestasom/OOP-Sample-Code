package labsolution;

public class Lab4 {

}

/* question 1 */
abstract class Student {
	private String name;
	private String id;
	private int year;

	public Student(String name, String id, int year) {
		this.name = name;
		this.id = id;
		this.year = year;
	}

	public abstract int balanceHours();

	public String toString() {
		return "Name: " + name + "\nStudent ID: " + id + "\nYear Admitted: " + year;
	}

}

class FCMIT extends Student {
	private int uniHours;
	private int facHours;
	private int elHours;

	public FCMIT(String name, String id, int year, int uni, int fac, int el) {
		super(name, id, year);
		uniHours = uni;
		facHours = fac;
		elHours = el;
	}

	public int balanceHours() {
		return 120 - (uniHours + facHours + elHours);
	}

	public String toString() {
		return super.toString() + "\nHours of university subjects taken: " + uniHours
				+ "\nHours of faculty subjects taken: " + facHours + "\nHours of elective subjects taken: " + elHours;
	}

	public static void main(String[] args) {
		FCMIT student = new FCMIT("Julia", "123456789", 2015, 9, 32, 12);
		System.out.println(student);
	}

}

/* Question 2 */
class Account {
	protected double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amt) {
		balance = balance - amt;
	}

}

class CheckingAccount extends Account {
	double overdraftAmount;

	// ans of a)
	public CheckingAccount() {
		super(0.0);
		this.overdraftAmount = 0.0;
	}

	// ans of b) two constructors
	public CheckingAccount(double balance, double overdraft) {
		super(balance);
		this.overdraftAmount = overdraft;
	}

	public CheckingAccount(double balance) {
		this(balance, 0.0);
	}

	// ans of c)
	public void withdraw(double amt) {
		if (balance < amt) {
			double overdraftNeeded = amt - balance;
			if (overdraftAmount < overdraftNeeded) {
				System.out.println("Transaction failed");
			} else {
				balance = 0.0;
				overdraftAmount -= overdraftNeeded;
			}
		} else {
			balance -= amt;
		}

	}

}

/* Question 3 */
class Square {
	protected int side;

}

interface Relational {
	boolean equals(Square s);
}

class Cube extends Square implements Relational {
	public boolean equals(Square s) {
		if (side == s.side) {
			return true;
		}
		return false;
	}
}
