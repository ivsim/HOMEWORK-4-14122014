package exec_2_stock;

public class Fruits extends Stock {
	
	private String name;
	private int numberPackages;//брой кашони..
	private String fruitState;//състояние...
	
	public Fruits (String name, float itemPrice, boolean itemAvailability, int numberPackages, String fruitState){
		this.name = name;
		super.itemPrice = itemPrice;
		super.itemAvailability = itemAvailability;
		this.numberPackages = numberPackages;
		this.fruitState = fruitState;
	}
	
	public void print(){
		
		String temp = "";
		
		if (super.itemAvailability == true){temp = "available";}
		else {temp = "unavailable";}
		
		System.out.printf("|%-17s|%-17.1f|%-17s|%-17d|%-17s|%n", this.name, super.itemPrice, temp,
				this.numberPackages, this.fruitState);
	}
	
}
