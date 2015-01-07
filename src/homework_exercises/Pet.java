package homework_exercises;

public class Pet {
	
	protected String name;
	protected int years;
	
	public Pet(){
		
		this.name = "";
		this.years = 0;
		
	}
	
	public Pet(String name, int years){
		
		this();
		
		setName(name);
		setYears(years);
		
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public int getYears(){
		
		return years;
		
	}
	
	public void setYears(int years){
		
		this.years = years;
		
	}
	
	public void greet(){
		
		System.out.printf("Hello I am %s. \n", this.name);
		System.out.printf("I am %d years old. \n", this.years);
		
	}
		

}
