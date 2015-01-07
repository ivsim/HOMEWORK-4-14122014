package exec_1_car;

public class Suv extends Car{
	private boolean uv;
	
	public Suv(int money, boolean uv){
		super (money);
		this.uv = uv;
	}
	
	public void printSpecs(){
		
		String temp = "";
		
		if (this.uv == true){
			temp = "UV";
		}
		if (this.uv == false){
			temp = "non-UV";
		}
		
		//override...
		System.out.printf("%-7d, %-7s%n", super.price, temp);
	}
}
