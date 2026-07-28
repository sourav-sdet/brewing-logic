package hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

    public static int longestSubArrayWithGivenSumNaive(int arr[], int n, int sum){

        int res=0;

        // Consider all possible sub arrays
        for(int i=0; i<n; i++){
            int currSum = 0;

            // For every arr[i], find the sum of all sub arrays startig with this element
            for(int j=i; j<n; j++){
                currSum = currSum + arr[j];

                if(currSum == sum){
                    res = Math.max(res, j-i+1);
                }
            }


        }

        return res;

    }



    public static int longestSubArrayWithGivenSum(int arr[], int n, int sum){

        int res=0;
        int preSum =0;
        HashMap<Integer, Integer> h = new HashMap<>();

        // Traverse through the array from left to right
        for(int i=0; i<n; i++){

            // Compute the prefix sum
            preSum = preSum + arr[i];

            // If preSum is not already present in hash map
            if(h.containsKey(preSum) == false)
                h.put(preSum, i);


            if(h.containsKey(preSum - sum))
                res = Math.max(res, i - h.get(preSum - sum));

        }

        return res;

    }



    public static void main(String args[]){

        int arr[] ={8,3,1,5,-6,6, 2,2};
		int result = longestSubArrayWithGivenSum(arr, arr.length, 4);
        System.out.println(result);
		
    }
    
}
