package homework_exercises;

/*
 * Направете клас Employee който съдържа базовите характеристики за един работник:часове работа на месец и месечна заплата
 * Направете клас Policeman, който наследява Employee и добавя поле за полицейския ранк на дадения полицай
 * Направете клас Doctor, който наследява Employee и добавя полета за броя нощни и броя целодневни дежурства на месец
 * Направете нужните get/set методи както и методи за извеждане на информацията за обектите в конзолата
 */

public class Employee {

	protected int hoursMonth;
	protected int salaryMonth;
	
	public Employee(int hoursMonth, int salaryMonth){
		this.hoursMonth = hoursMonth;
		this.salaryMonth = salaryMonth;
	}
	
	public int getHours(){
		return this.hoursMonth;
	}
	
	public int getSalary(){
		return this.salaryMonth;
	}
	
	public void setHours(int hours){
		this.hoursMonth = hours;
	}
	
	public void setSalary(int salary){
		this.salaryMonth = salary;
	}
	
	public void printInfo(){
		System.out.printf("hours per month: %d, monthly payment: %d Euro", this.hoursMonth, this.salaryMonth);
	}
	
}
