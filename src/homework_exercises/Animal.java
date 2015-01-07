package homework_exercises;

public class Animal extends Creature {
	
	private float height;
	
	public Animal(int age, float height){
		
		super.age = age;
		this.height = height;
		
	}
	
	public void greet(){
		System.out.printf("I am an animal and I am %d years old.%nMy Height is %f.%n", super.age, this.height);		
	}

}
