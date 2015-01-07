package exec_4_degrees;

import java.util.Scanner;

public class Exec_4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Celsius degrees: ");
		float degrees = input.nextFloat();
		
		System.out.printf("Fahrenheit degrees: %.2f", Celsius.fahrenheitCalculator(degrees));
		
		input.close();
				
	}

}
