package classesAndObjects;

public class EqualsToExample {
	public static void main(String[] args) {
		Stock1 s1=new Stock1("GMX",55.3);
		Stock1 s2=new Stock1("GMX",55.3);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}


class Stock1{
	String symbol;
	double sharePrice;
	
	
	
	public Stock1(String symbol, double sharePrice) {
		this.symbol = symbol;
		this.sharePrice = sharePrice;
	}
	
	
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public double getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock1 other = (Stock1) obj;
		if (Double.doubleToLongBits(sharePrice) != Double.doubleToLongBits(other.sharePrice))
			return false;
		if (symbol == null) {
			if (other.symbol != null)
				return false;
		} else if (!symbol.equals(other.symbol))
			return false;
		return true;
	}
	
	
	
	
}