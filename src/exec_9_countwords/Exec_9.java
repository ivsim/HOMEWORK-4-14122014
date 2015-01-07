package exec_9_countwords;

import java.util.Scanner;

public class Exec_9 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please, write down a sentence:");
		
		String sentence = input.nextLine();

//		String sentence = " 23 My dear good very well I morning; they go there, \"dfdfdf\" [] {} open fire 56+_} | къщата на дядо Поп.";
		
		String lowCase = sentence.toLowerCase(); //all letters low case...
		
		char[] lowCaseToChar = lowCase.toCharArray();//string becomes array...
		
		int[] newArray = new int[lowCaseToChar.length + 1]; newArray[0] = 0; //we make transitional array...
		
		for (int i = 0; i < lowCaseToChar.length; i++){ //here we fill the array with 0 an 1 according to char letters...
			if ((((int)lowCaseToChar[i] >= 97) && ((int)lowCaseToChar[i] <= 122))
					|| 
				(((int)lowCaseToChar[i] >= 1072) && ((int)lowCaseToChar[i] <= 1103))){ // latin & cyrillic check...
				
				newArray[i+1] = 1;
			}
			
			else{
				newArray[i+1] = 0;
			}
		}
		
		int counter = 0;
		for (int i = newArray.length - 1; i >= 1; i--){
			if (newArray[i] > newArray[i-1]){
				++ counter;
			}
		}
		
		System.out.println("There are " + counter + " words in the sentence.");
		
		input.close();
		
		
		
	}

}
