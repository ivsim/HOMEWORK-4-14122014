package homework_exercises;

public class Cat {

	private String name;
	private String breed;
	private int age;
	
	public Cat(){
		
		this.name = "";
		this.breed = "";
		this.age = 0;
		
	}
	
	public Cat(String name, String breed, int age){
		
		this();
		
		setName(name);
		setBreed(breed);
		setAge(age);
		
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public void setName(String name){
		
		if(name != null){this.name = name;}
		
	}
	
	public String getBreed(){
		
		return breed;
		
	}
	
	public void setBreed(String breed){
		
		if (breed != null){this.breed = breed;}
		
	}
	
	public int getAge(){
		
		return age;
		
	}
	
	public void setAge(int age){
		
		if (age >= 0){this.age = age;}
		
	}
	
	public void sayMiau(boolean identify){
		
		System.out.println("Miauuuuuu Myrrrrr!");
		
		if (identify){sayName(); sayBreed(); sayAge();}
		
	}
	
	public void sayName(){
		
		System.out.printf("My pretty name is %s.", this.name);
		System.out.println();
		
	}
	
	public void sayBreed(){
		
		System.out.printf("The best breed in the world is mine: %s.", this.breed);
		System.out.println();
		
	}
	
	public void sayAge(){
		
		System.out.printf("I am young lady at %d.", this.age);
		System.out.println();
		
	}
	
	
	
	
}
