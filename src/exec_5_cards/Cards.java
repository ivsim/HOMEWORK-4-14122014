package exec_5_cards;

public class Cards {
	
	public static String[] quarterStack = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
	public String[] cardStack;
	public String name;
	
	public Cards(String name){
		this.cardStack = quarterStack;
		this.name = name;
	}
	
	public void print(int x){
		System.out.println("Card is: " + this.cardStack[x] + " " + this.name);
	}
	
	
	
	
	
	
	
	
}
