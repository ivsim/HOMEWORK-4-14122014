package exec_5_cards;

import java.util.Scanner;

public class Exec_5 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Please, enter number (1-52): ");
		int inputNum = input.nextInt();
		
		Cards[] stack = {new Cards("club"), new Cards("diamond"), new Cards("heart"), new Cards("spade")};
		
		if (inputNum >= 1  && inputNum <= 13){(stack[0]).print(inputNum - 1);}
		if (inputNum >= 14 && inputNum <= 26){(stack[1]).print(inputNum - 14);}
		if (inputNum >= 27 && inputNum <= 39){(stack[2]).print(inputNum - 27);}
		if (inputNum >= 40 && inputNum <= 52){(stack[3]).print(inputNum - 40);}
		
		input.close();

		
		
		
		
	}

}
