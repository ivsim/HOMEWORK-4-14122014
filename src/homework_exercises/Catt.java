package homework_exercises;

public class Catt extends Pet {
	
	private String breed;
	
	public Catt(){
		
		super();
		
		this.breed = "";
		
	}
	
	public Catt(String name, int age, String breed){
		
		super(name, age);//args names may be different than descendant's arg names...
		
		setBreed(breed);		
		
	}
	
	public String getBreed(){
		
		return breed;
		
	}
	
	public void setBreed(String breed){
		
		this.breed = breed;
		
	}
	
	public void sayBreed(){
		
		System.out.printf("My breed is %s. \n", this.breed);
		
	}

}
