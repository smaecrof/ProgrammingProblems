import java.util.Arrays;

public class ReverseArrayChallenge {
	
	public static void reverse(int[] inputArray) {
	
		int arrayMidpointIndex = (inputArray.length / 2) ;
		for(int i = 0; i < arrayMidpointIndex; i++) {
			int tempValue = inputArray[i]; 
			int endSwapLocation = inputArray.length - (i + 1); 
			inputArray[i] = inputArray[endSwapLocation];
			inputArray[endSwapLocation] = tempValue; 
		}
		
		// Print the Array
		System.out.println(Arrays.toString(inputArray)); 
	}
	
	public static void main(String[] args) {
		int[] evenArray = {1,2,3,4,5,6};
		int[] oddArray = {1,2,3,4,5}; 
		
		System.out.println(Arrays.toString(evenArray));
		System.out.println(Arrays.toString(oddArray)); 
		
		System.out.println(); 
		
		reverse(evenArray);
		System.out.println(); 
		reverse(oddArray); 
	}
}
