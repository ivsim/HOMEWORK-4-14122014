package exec_2_stock;

public class Meat extends Stock{
	
	private String name;
	private String meatType;//тип на месото...
	private float meatGrams;//разфасовка...
	
	public Meat (String name, float itemPrice, boolean itemAvailability, String meatType, float meatGrams){
		this.name = name;
		super.itemPrice = itemPrice;
		super.itemAvailability = itemAvailability;
		this.meatType = meatType;
		this.meatGrams = meatGrams;
	}
	
	public void print(){
		
		String temp = "";
		
		if (super.itemAvailability == true){temp = "available";}
		else {temp = "unavailable";}
		
		System.out.printf("|%-17s|%-17.1f|%-17s|%-17s|%-17.1f|%n", this.name, super.itemPrice, temp,
				this.meatType, this.meatGrams);
	}
		
}
