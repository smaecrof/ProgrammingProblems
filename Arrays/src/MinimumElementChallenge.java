import java.util.Scanner;

public class MinimumElementChallenge {

	private static Scanner scanner = new Scanner(System.in);
	
	public static int[] readIntegers(int number) {
		int[] input = new int[number]; 
		
		System.out.println("Enter " + number + " integers:\r");
		for(int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
		}
		return input; 
	}
	
	public static int findMin(int[] array) {
		int minValue = Integer.MAX_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] < minValue) {
				minValue = array[i]; 
			}
		}
		return minValue; 
	}
	
	
	public static void main(String[] args) {
		int[] inputArray = readIntegers(4);
		System.out.println("Minimum Value entered: " + findMin(inputArray)); 
	}
}
