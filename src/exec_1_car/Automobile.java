package exec_1_car;

public class Automobile extends Car{
	
	private float fuelConsumption;
	
	public Automobile(int money, float fuelConsumption){
		super(money);
		setFuel(fuelConsumption);
	}
	
	public void setFuel(float fuelConsumption){
		if (fuelConsumption > 0)
		{this.fuelConsumption = fuelConsumption;}
		else
		{this.fuelConsumption = 0;}
	}
	
	//override...
	public void printSpecs(){
		System.out.printf("%-7d, %-7.1f%n", super.price, this.fuelConsumption);//formatting the float /.num/f !...
	}
	
	
	
	
	
}
