package homework_exercises;

public class Human extends Creature {
	
	private String name;
	
	public Human(String name, int age){
		
		setName (name);
		super.age = age;
		
	}
	
//	public String getName(){
//		
//		return name;
//		
//	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public void greet(){
		
		System.out.printf("Hello I am %s.%nI am %d years old.%n", this.name, this.age);
		
	}

}
