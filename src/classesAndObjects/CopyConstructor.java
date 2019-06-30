package classesAndObjects;

public class CopyConstructor {

	public static void main(String[] args) {
		InventoryItems i1=new InventoryItems("abc",3);
		InventoryItems  i2=i1; //no new object is created. reference of object stored in i1 is copied to i2
		InventoryItems i3=new InventoryItems(i1.description,i1.units); //new object is created using values from old object
		
	}
	
}


class InventoryItems{
	String description;
	int units;
	
	public InventoryItems() {
		
	}
	
	public InventoryItems(InventoryItems item) {
		description=item.description;
		units=item.units;
	}



	public InventoryItems(String description, int units) {
		this.description = description;
		this.units = units;
	}

	
	
	
	
}