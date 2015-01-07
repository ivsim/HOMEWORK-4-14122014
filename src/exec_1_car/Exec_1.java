package exec_1_car;

public class Exec_1 {

	public static void main(String[] args) {
				
		Car auto1 = new Automobile(12300, 5.6f);//because Auto.. and Suv are subclasses of Car...
		Car auto2 = new Automobile(2350, 13f);
		Car auto3 = new Automobile(8800, 7.5f);
		Car auto4 = new Automobile(6500, 5.2f);
		Car auto5 = new Automobile(2300, 4.3f);

		Car suv1 = new Suv(24000, true);
		Car suv2 = new Suv(5005, false);
		Car suv3 = new Suv(9450, false);
		Car suv4 = new Suv(3850, false);
		Car suv5 = new Suv(4666, true);
				
		Car[] vehicles = {auto1, auto2, auto3, auto4, auto5, suv1, suv2, suv3, suv4, suv5};
		
		arraySort(vehicles);//function to sort...
		printAscendingorder(vehicles);//function to print the list...
//		printDescendingorder(vehicles);
	
	}
	
	public static void arraySort(Car array[]){
		
		int sum = 0;		
		for (int i = 1; i < array.length; i++)
		{sum = sum + i;}//1+2+3+...+(.length-2)+(.length-1)
		
		for (int j = 1; j <= sum; j++){ 
				
			for (int n = 1; n < array.length; n++){ // overall number of the internal bubble iterations for one array round: (.length -1)
						
				if (array[n-1].getCarprice() > array[n].getCarprice()) // simple comparison of two adjacent array members
				{
					Car numTransfer = array[n]; //passing an empty variable to serve as placeholder
					array[n] = array[n-1];
					array[n-1] = numTransfer;
				}
			}
		}
	}
	
	public static void printAscendingorder(Car array[]){
		for (int i = 0; i < array.length; i++){
			array[i].printSpecs();
		}
	}
	
	public static void printDescendingorder(Car array[]){
		for (int i = array.length - 1; i >= 0; i--){
			array[i].printSpecs();
		}
	}
	
	
	
}	

		
