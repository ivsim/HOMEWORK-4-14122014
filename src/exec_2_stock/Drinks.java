package exec_2_stock;

public class Drinks extends Stock {

	private String name;
	private String drinkName;
	private String drinkPacktype;
	
	public Drinks (String name, float itemPrice, boolean itemAvailability, String drinkName, String drinkPacktype){
		this.name = name;
		super.itemPrice = itemPrice;
		super.itemAvailability = itemAvailability;
		this.drinkName = drinkName;
		this.drinkPacktype = drinkPacktype;
	}
	
	public void print(){
		
		String temp = "";
		
		if (super.itemAvailability == true){temp = "available";}
		else {temp = "unavailable";}
		
		System.out.printf("|%-17s|%-17.1f|%-17s|%-17s|%-17s|%n", this.name, super.itemPrice, temp,
				this.drinkName, this.drinkPacktype);
	}
	
}
