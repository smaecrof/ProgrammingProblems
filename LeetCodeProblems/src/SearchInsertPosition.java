public class SearchInsertPosition {

    public static void main(String[] args) {
        int input[] = {1,3,5,6};
        int tests[] = {5,2,7,0};

        for(int i : tests){
            System.out.println("Input: " + "[1,3,5,6], " + i);
            int output = searchInsert(input, i);
            System.out.println("Output: " + output);
        }
    }

    public static int searchInsert(int[] nums, int target){
        int i;
        for(i = 0; i < nums.length; i++){
            if(nums[i] >= target){
                return i;
            }
        }
        return i;
    }
}
