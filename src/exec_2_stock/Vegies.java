package exec_2_stock;

public class Vegies extends Stock {
	
	private String name;
	private String vegOrigin;//произход...
	private String vegState;//състояние...
	
	public Vegies (String name, float itemPrice, boolean itemAvailability, String vegOrigin, String vegState){
		this.name = name;
		super.itemPrice = itemPrice;
		super.itemAvailability = itemAvailability;
		this.vegOrigin = vegOrigin;
		this.vegState = vegState;
	}
	
	public void print(){
		
		String temp = "";
		
		if (super.itemAvailability == true){temp = "available";}
		else {temp = "unavailable";}
		
		System.out.printf("|%-17s|%-17.1f|%-17s|%-17s|%-17s|%n", this.name, super.itemPrice, temp,
				this.vegOrigin, this.vegState);
	}
	
}
