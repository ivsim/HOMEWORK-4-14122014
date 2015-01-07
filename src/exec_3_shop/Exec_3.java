package exec_3_shop;

public class Exec_3 {

	public static void main(String[] args) {

		Shop lidl1 = new Shop("Sofia", "LIDL");
		
		lidl1.apples.setAvailable();
		lidl1.bananas.setAvailable();
		lidl1.beer.setAvailable();
		lidl1.chickenLegs.setUnavailable();
		lidl1.chickenWings.setAvailable();
		lidl1.chocolateCakes.setAvailable();
		lidl1.iceCream.setAvailable();
		lidl1.pears.setUnavailable();
		lidl1.pepper.setAvailable();
		lidl1.porkSteak.setUnavailable();
		lidl1.tomatoes.setUnavailable();
		lidl1.water.setAvailable();
				
		lidl1.print();
		
	}
}
