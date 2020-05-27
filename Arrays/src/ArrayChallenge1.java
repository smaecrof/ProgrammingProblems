import java.util.Scanner;

public class ArrayChallenge1 {
	
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int[] inputArray = getIntegers(5); 
		
		printArray(inputArray); 
		
		printArray(sortIntegers(inputArray)); 
	}
	
	
	public static int[] getIntegers(int number) {
		int[] array = new int[number];
		
		System.out.println("Enter " + number + " integers:"); 
		for(int i = 0; i < number; i++) {
			array[i] = scanner.nextInt();
		}
		return array; 
	}
	
	public static void printArray(int[] array) {
		
		for(int i = 0; i < array.length; i++) {
			System.out.println("Element at " + i + " : " + array[i]);
		}
	}
	
	public static int[] sortIntegers(int[] array) {
		
		int tempVal; 
		int swap; 
		
		do {
			swap = 0; 
			for(int i = 0; i < array.length; i++) {
				if((i + 1) < array.length && array[i] < array[i+1]) {
					System.out.println(i); 
					swap +=1;
					tempVal = array[i]; 
					array[i] = array[i+1];
					array[i+1] = tempVal; 
				}
			}
		}while(swap > 0); 
		
		return array; 
	}
	
}
