package exec_2_stock;

public class Desert extends Stock {

	private String name;
	private String desertName;
	private float desertPack;
	
	public Desert (String name, float itemPrice, boolean itemAvailability, String desertName, float desertPack){
		this.name = name;
		super.itemPrice = itemPrice;
		super.itemAvailability = itemAvailability;
		this.desertName = desertName;
		this.desertPack = desertPack;
	}
	
	public void print(){
		
		String temp = "";
		
		if (super.itemAvailability == true){temp = "available";}
		else {temp = "unavailable";}
		
		System.out.printf("|%-17s|%-17.1f|%-17s|%-17s|%-17.1f|%n", this.name, super.itemPrice, temp,
				this.desertName, this.desertPack);
	}
	
}
