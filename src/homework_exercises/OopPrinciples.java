package homework_exercises;

public class OopPrinciples {

	public static void main(String[] args) {
		Shape first = new Square(3.12f);
		float firstArea = first.calculateArea();
		
		Shape second = new Rectangle(12.3f, 6.18f);
		float secondArea = second.calculateArea();
		
		System.out.printf("First shape name: %s,\nArea %f\n", first.getName(), firstArea);
		System.out.printf("Second shape name: %s,\nArea %f\n", second.getName(), secondArea);
	}

}
