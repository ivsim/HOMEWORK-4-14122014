package exec_2_stock;

public abstract class Stock {
	
	public float itemPrice;
	public boolean itemAvailability;
	
	public void setAvailable(){
		this.itemAvailability = true;
	}
	
	public void setUnavailable(){
		this.itemAvailability = false;
	}
	
	public abstract void print();
}
