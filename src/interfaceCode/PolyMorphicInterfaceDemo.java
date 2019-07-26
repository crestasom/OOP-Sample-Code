package interfaceCode;

public class PolyMorphicInterfaceDemo {

	public static void main(String[] args) {
		RetailItems item1 = new CompactDisc();
		RetailItems item2 = new DvdMovie();
		item2.price();
		//item2.movieName(); //error here!!
	}
	


}

interface RetailItems {
	int price();
}

class CompactDisc implements RetailItems {

	public int price() {
		return 50;
	}
}

class DvdMovie implements RetailItems {
	public int price() {
		return 70;
	}
	public String movieName() {
		return "spiderman";
	}
}