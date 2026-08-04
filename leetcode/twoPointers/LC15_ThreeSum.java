package leetcode.twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LC15_ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums){
        // nums[i] + nums[j] + nums[k] == 0
        // i != j, i != k , j != k
        // The solution set must not contain duplicate triplets

        // Edge Case
        if(nums == null || nums.length < 3)
            return new ArrayList<>();

        // Sort the array so that TWO POINTER APPROACH CAN BE USED
        Arrays.sort(nums);

        // HashSet to store the result
        HashSet<List<Integer>> hset = new HashSet<>();

        for(int i=0; i<nums.length; i++){

            int low = i+1, high = nums.length -1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    hset.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low ++;
                    high --;
                }

                else if(sum > 0)
                    high--;
                else
                    low++;

            }
        }

        return new ArrayList<>(hset);


    }




    public static void main(String args[]){
        int[] nums = {-1,0,1,2,-1,-4};
        List<List<Integer>> result=threeSum(nums);
        System.out.println(result);

    }
    
}
