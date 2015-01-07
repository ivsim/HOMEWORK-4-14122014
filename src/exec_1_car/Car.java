package exec_1_car;

public class Car {
	public int price;
	
	public Car(int price)
	{this.price = price;}
	
	public int getCarprice(){
		return price;
	}
	
	public void printSpecs(){
		System.out.printf("%-7d", this.price);//doing it because array shall be of type Car
	}
}

//every subclass is to have its own override method because Car array shall consist of different type elements...