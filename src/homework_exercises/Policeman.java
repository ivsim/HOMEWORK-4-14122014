package homework_exercises;

public class Policeman extends Employee{

	private String rank;
	
	public Policeman(int hoursMonth, int salaryMonth, String rank){
		super(hoursMonth, salaryMonth);
		setRank(rank);
	}
	
	public void setRank(String rank){
		this.rank = rank;
	}
	
	public String getRank(){
		return this.rank;
	}
	
	public void printInfo(){
		System.out.printf("rank: %s, hours per month: %d, monthly payment: %d Euro", this.rank, super.hoursMonth, super.salaryMonth);
	}				
	
}
