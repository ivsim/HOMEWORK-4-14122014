package exec_8_numbers;

//import java.util.Scanner;

public class Exec_8 {

	public static void main(String[] args) {

//		Scanner input = new Scanner(System.in);
//		String[] enterNums = new String[10];
		
//		for (int i = 1; i<=enterNums.length; i++){
//			System.out.print("Please, enter number " + i + ": ");
//			enterNums[i-1] = input.nextLine();
//		}
		
		int[] enterNums = {5, 4, 3, 2, 0, -6, -12, -18, -19, -21};
		int[] newArray = new int[10]; // this is our template array...
		
		// here we make our template array from the enterNums array -> newArray
		transformNums(enterNums, newArray);
		
		// here we find at which array member position the last member of the longest sequence is...
		int index = findBiggestNum(newArray);
		
		if (findBiggestNum(newArray) == 0){ // there is a great risk that there are sequences with equal number of members...
			System.out.println("NO largest number sequence found!");
			}
		else{
			index = findBiggestNum(newArray) + 1;
			int minIndex = index;
			

			// now we iterate over the entered array to find the longest sequence...
			for (int i = index; i >= 1; i--){ 
				if ((enterNums[i] > enterNums[i-1]) || i == 0){ //when i-- becomes 0 [i-1] is out of array range but 0 member is still part of the sequence...
					minIndex = minIndex - 1;
				}
				else{
					break; // this stop point is very important to add, otherwise the loop shall continue to other sequences...!!!
				}
				
				
			}			

			
			// here we print the result to the console...
			System.out.print("Longest number sequence is: ");
			while (minIndex <= (findBiggestNum(newArray) + 1)){
				System.out.print(enterNums[minIndex] + " ");
				minIndex++;
			}
			
		}
		
//		input.close();
				
	}
	

	public static int findBiggestNum(int[] array){ //returns either 0 or a positive number...there is no way last member to be at zero position
		
		int foundBiggestNumPosition = 0;

		for (int i = 0; i < array.length; i++){
			int counter = 0; 
			for (int j = 0; j < array.length; j++){
				if (array[i] > array[j]){
					++ counter; //very careful with ++ and -- ....
				}
							
			}
			if (counter == (array.length-1)){
				foundBiggestNumPosition = i;
				
			}		
					
		}
		
		return foundBiggestNumPosition;
			
	}
	
	
	public static void transformNums(int[] array1, int[] array2){
		
		int counter = 1; 
		for (int i = 0; i < (array1.length - 1); i++){ //otherwise we are out of array
			if (array1[i] < array1[i+1]){
				array2[i] = counter ++;
				
				
			}
			else{
				array2[i] = 0;
				counter = 1;
			}
			
		}
	}
	


}
