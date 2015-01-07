package homework_exercises;

public class Person {

	private String name;
	private int year;
	private String mail;
	
	public Person (String name, int year, String mail){
		
		setName(name);
		setYears(year);
		setMail(mail);

	}
	
	public void output(){
				
		System.out.printf("име: %s%n", this.name);
		System.out.printf("години: %s%n", this.year);
		System.out.printf("e-mail: %s%n" , this.mail);
		
	}
	
	public void setName(String name){
		if (name.length() >= 3){
			this.name = name;			
		}
		else{
			System.out.println("Please, enter name of more than 3 characters");
		}
	}
	
	public void setYears(int year){
		if (year >= 0 && year <= 200){
			this.year = year;			
		}
	}
	
	public void setMail(String mail){
		if (mail.length() >= 3){
			this.mail = mail;			
		}
	}
	
	
	
	public String getName(){
		return this.name;
	}		
		
	public int getYear(){			
		return this.year;				
	}
	
	public String getMail(){
		return this.mail;
	}
	
	
	
	
}
