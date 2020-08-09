package com.spencermaecroft;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] returnNums = twoSum(nums, target);
        for(int i:returnNums){
            System.out.print(i + ", "); 
        }
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> prevMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int difference = target - nums[i];

            if(prevMap.containsKey(difference)){
                return new int[]{prevMap.get(difference), i};
            }
            prevMap.put(nums[i],i);
        }
        return new int[0];
    }

}
