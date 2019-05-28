package secondlookatobject;

public class EqualsToExample {
	public static void main(String[] args) {
		Stock s1=new Stock("GMX",55.3);
		Stock s2=new Stock("GMX",55.3);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}

}


class Stock{
	String symbol;
	double sharePrice;
	
	
	
	public Stock(String symbol, double sharePrice) {
		super();
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(sharePrice);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((symbol == null) ? 0 : symbol.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
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