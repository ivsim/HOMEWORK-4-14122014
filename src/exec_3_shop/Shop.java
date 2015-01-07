package exec_3_shop;

import exec_2_stock.Stock;
import exec_2_stock.Meat;
import exec_2_stock.Vegies;
import exec_2_stock.Fruits;
import exec_2_stock.Drinks;
import exec_2_stock.Desert;

public class Shop {

	private String location;
	private String name;
	
	public Shop (String location, String name){
		this.location = location;
		this.name = name;
	}
	
	Stock chickenLegs = new Meat("chickenLegs", 4.68f, false, "chicken", 250.00f);
	Stock chickenWings = new Meat("chickenWings", 3.42f, false, "chicken", 125.00f);
	Stock porkSteak = new Meat("porkSteak", 10.47f, false, "pork", 1200.00f);
	
	Stock tomatoes = new Vegies("tomatoes", 2.39f, false, "BG", "packs - 1 kg");
	Stock pepper = new Vegies("pepper", 2.36f, false, "BG", "packs - 5 kg");
	
	Stock apples = new Fruits("apples", 1.25f, false, 10, "frozen");
	Stock bananas = new Fruits("bananas", 1.00f, false, 12, "frozen");
	Stock pears = new Fruits("pears", 2.21f, false, 23, "packs");
	
	Stock beer = new Drinks("beer", 0.99f, false, "chicken", "can");
	Stock water = new Drinks("water", 0.60f, false, "chicken", "bottles");
	
	Stock iceCream = new Desert("iceCream", 4.68f, false, "chicken", 100.00f);
	Stock chocolateCakes = new Desert("chocolateCakes", 4.68f, false, "chicken", 35.00f);
	
	Stock[] products = {chickenLegs, chickenWings, porkSteak, tomatoes, pepper, apples, 
						bananas, pears, beer, water, iceCream, chocolateCakes};
	
	public void printShopName(){
		System.out.printf("name: %s, location: %s%n", this.name, this.location);
		System.out.println();
	}
	
	public void print(){
		printShopName();
		for (Stock x: products)
		{x.print();}
	}
	
}
