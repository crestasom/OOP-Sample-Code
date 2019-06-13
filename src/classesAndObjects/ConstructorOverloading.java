package classesAndObjects;

import java.text.DecimalFormat;

@SuppressWarnings("unused")
public class ConstructorOverloading {

	public static void main(String[] args) {
		InventoryItem i1=new InventoryItem();
		InventoryItem i2=new InventoryItem("abc");
		InventoryItem i3=new InventoryItem("abc",3);
		
	}
	
}


class InventoryItem{
	String description;
	int units;
	
	public InventoryItem() {
		description="";
		units=0;
		
	}
	
	public InventoryItem(String description) {
		this.description = description;
		units=0;
	}



	public InventoryItem(String description, int units) {
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