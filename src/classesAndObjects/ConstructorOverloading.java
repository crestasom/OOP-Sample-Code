package classesAndObjects;

public class ConstructorOverloading {

	public static void main(String[] args) {
		InventoryItem i1=new InventoryItem();
		InventoryItem i2=new InventoryItem("abc");
		InventoryItem i3=new InventoryItem("abc",3);
		System.out.println(i1);
	}
	
}


class InventoryItem{
	String description;
	int units;
	
	public InventoryItem() {
		
	}
	
	public InventoryItem(String description) {
		super();
		this.description = description;
	}



	public InventoryItem(String description, int units) {
		super();
		this.description = description;
		this.units = units;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}
	
	
	
	
}