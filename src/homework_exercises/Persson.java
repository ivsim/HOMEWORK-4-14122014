package homework_exercises;

public class Persson {
	
	String name;
	int age;
	
	public Persson (String name, int age){
		
		this.name = name;
		this.age = age;
		
	}
	
	public void greet(){
		
		System.out.printf("Hello, I am %s!", this.name);
		System.out.println();
		
		System.out.printf("Hello, I am %d years old!", this.age);
		System.out.println();
		
	}
	
	

}
