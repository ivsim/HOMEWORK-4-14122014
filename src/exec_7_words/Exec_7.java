package exec_7_words;

//import java.util.Scanner;

public class Exec_7 {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		String[] inputWords = new String[20];

	String[] inputWords = {"red", "sss", "fff", "fff", "sss"};	
		
//		for (int i = 1; i<=inputWords.length; i++){
//			System.out.print("Please, enter word " + i + ": ");
//			inputWords[i-1] = input.nextLine();
//		}
		
		equalWords(inputWords);
		
//		input.close();

	}
	
	public static void equalWords(String array[]){
		int counter = 0;
		for (int i = 0; i < array.length; i++){
			for (int j = 0; j < array.length; j++){
				
				if (array[i].equals(array[j]) && (array[i] != "") && (array[j] != "")){
					{counter++;}
					if (counter > 1){System.out.println(array[i]);array[i] = "";array[j] = "";counter = 0;}
					
				}
			}
		}
		
			

					
	}

}
