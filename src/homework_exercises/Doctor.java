package homework_exercises;

public class Doctor extends Employee {

	private int numDayShift;
	private int numNightShift;
	
	public Doctor(int hoursMonth, int salaryMonth, int numDayShift, int numNightShift){
		super(hoursMonth, salaryMonth);
		setDayShift(numDayShift);
		setNightShift(numNightShift);
	}
	
	public void setDayShift(int numDayShift){
		this.numDayShift = numDayShift;
	}
	
	public void setNightShift(int numNightShift){
		this.numNightShift = numNightShift;
	}
	
	public int getDayShift(){
		return this.numDayShift;
	}
	
	public int getNightShift(){
		return this.numNightShift;
	}
	
	public void printInfo(){
		System.out.printf("hours per month: %d, monthly payment: %d, day shifts: %d, night shifts: %d", super.hoursMonth, super.salaryMonth, this.numDayShift, this.numNightShift);
	}
	
}
