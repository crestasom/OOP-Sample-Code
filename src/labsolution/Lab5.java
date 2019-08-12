package labsolution;

import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		//ans of i)
		Cake[] cakeList = new Cake[20];
		
		//ans of ii)
		for (int i = 0; i < 20; i++) {
			System.out.println("Enter type of cake(1. Readymade\n2. Order");
			choice = sc.nextInt();
			sc.next();
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter rate:");
			double rate = sc.nextDouble();
			if (choice == 1) {
				System.out.println("Enter quantity:");
				double qty = sc.nextDouble();
				cakeList[i] = new readymadeCake(name, rate, qty);
			} else if (choice == 2) {
				System.out.println("Enter weight:");
				double wt = sc.nextDouble();
				cakeList[i] = new orderCake(name, rate, wt);
			}
		}
		
		//ans of iii)
		for (int i = 0; i < 20; i++) {
			System.out.println(cakeList[i].calcPrice());
		}
		
		// ans of iv)
		double totalPrice = 0, totalQuantity = 0;
		for (int i = 0; i < 20; i++) {
			if (cakeList[i] instanceof readymadeCake) {
				readymadeCake temp = (readymadeCake) cakeList[i];
				totalPrice += temp.calcPrice();
				totalQuantity += temp.quantity;
			}
			System.out.println("total price of readymade cake is " + totalPrice);
			System.out.println("total quantity of readymade cake is " + totalQuantity);
		}

		//ans of v
		Cake highestPriceCake = cakeList[0];
		for (int i = 1; i < 20; i++) {
			if (cakeList[i].calcPrice() > highestPriceCake.calcPrice()) {
				highestPriceCake = cakeList[i];
			}
		}

		System.out.println("The cake with highest price is " + highestPriceCake.name + " with rate =" + highestPriceCake.rate);
	}
}

abstract class Cake {
	protected String name;
	protected double rate;

	public Cake(String n, double r) {
		name = n;
		rate = r;

	}

	public abstract double calcPrice();

	public String toString() {
		return name + "\t" + rate;
	}
}

class orderCake extends Cake {

	double weight;

	public orderCake(String n, double r, double weight) {
		super(n, r);
		this.weight = weight;

	}

	public double calcPrice() {
		return weight + rate;
	}
}

class readymadeCake extends Cake {

	double quantity;

	public readymadeCake(String n, double r, double quantity) {
		super(n, r);
		this.quantity = quantity;

	}

	public double calcPrice() {
		return quantity + rate;
	}

}