package homework_exercises;

public class StaticMembers {

	public static void main(String[] args) {
		Car audi = new Car("Audi", "A7");
		
		System.out.printf("Cars count: %d", Car.getCarsCount());
		System.out.println();
		
		Car bmw = new Car("BMW", "X6");
		
		System.out.printf("Cars count: %d", Car.getCarsCount());
		System.out.println();
		
		Car vw = new Car("Volkswagen", "touareg");
		
		System.out.printf("Cars count: %d", Car.getCarsCount());
		System.out.println();
		
		
	}

}
