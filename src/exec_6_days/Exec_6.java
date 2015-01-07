package exec_6_days;

import java.util.Scanner;

public class Exec_6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Please, enter days number: ");
		int y = input.nextInt();
		Days days = new Days(y);
		System.out.printf("Days comprise %d seconds.", days.daysToSeconds());
		input.close();		
	}

}
