import java.util.Arrays; 

public class RemoveItemClass {
	public static int removeElement(int[] nums, int val) {
		if(nums.length == 0) {
			return 0; 
		}
		
		int i = 0;
		int n = nums.length; 
		
		while(i < n) {
			if(nums[i] == val) {
				nums[i] = nums[n-1]; 
				n--;
			} else {
				i++;
			}
		}
		return n; 
	}
	
	
	public static void main(String[] args) {
		int[] array = {4,2,4,5,2};
		
		System.out.println(removeElement(array, 5)); 
		
		for (int x : array) {
			System.out.print(x + ", ");
		}
	}
}
