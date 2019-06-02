package classesAndObjects;

public class ConstuctorOverloadingUsingThis {
	public static void main(String[] args) {
		Stock stock1=new Stock("abc");
		Stock stock2=new Stock("abc",3.4);
		System.out.println(stock1);
		System.out.println(stock2);
	}

}

class Stock {
	private String sym;
	private double price;

	public Stock(String sym, double price) {
		super();
		this.sym = sym;
		this.price = price;
	}

	public Stock(String sym) {
		this(sym, 0.0); // calls above constructor
	}

	@Override
	public String toString() {
		return "Stock [sym=" + sym + ", price=" + price + "]";
	}
	
	
}