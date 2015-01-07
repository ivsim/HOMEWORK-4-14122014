package exec_10_fivechars;

import java.util.Scanner;

public class Exec_10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		char[] chars = new char[5];
		
		System.out.print("Please, enter word: ");
		String fiveCharWord = input.nextLine();
		
		for (int i = 0; i <= 4; i++){
			System.out.print("Please, enter char " + (i+1) + " : ");
			chars[i] = input.next().charAt(0);
		}
		
		
		
//		String fiveCharWord = "kapak";
		
//		char enter1 = 'k';
//		char enter2 = 'k';
//		char enter3 = 'p';
//		char enter4 = 'a';
//		char enter5 = 'a';
		
		char[] charWord = fiveCharWord.toCharArray();
//		char[] chars = {enter1, enter2, enter3, enter4, enter5};
				
		char star = '*';
		
		int counter = 0;
		
		for (int i = 0; i < chars.length; i++){
			for (int j = 0; j < charWord.length; j++){
				if ((int)chars[i] == (int)charWord[j]){// let's cast the chars...
					++ counter;
					charWord[j] = star;
					break;
				}
			}
						
		}
		
//		System.out.println(counter);
		for (char x: charWord){
			System.out.print(x + " ");
		}
		
		
		if (counter == fiveCharWord.length()){
			System.out.print("Yes, you can form the word with the five entered chars.");
		}
		else{
			System.out.print("No, there is no way you can form a word with the five entered chars.");
		}
		
		input.close();
		
	}

}
