package homework_exercises;

public class Exec_2_lecture {

	public static void main(String[] args) {

		Policeman cop1 = new Policeman(80, 800, "lieutenant");
		Employee employee1 = new Employee(40, 400);
		Doctor doc1 = new Doctor(100, 1600, 20, 8);
		
		cop1.printInfo();
		System.out.println();
		
		employee1.printInfo();
		System.out.println();
		
		doc1.printInfo();
		System.out.println();
		
	}

}
