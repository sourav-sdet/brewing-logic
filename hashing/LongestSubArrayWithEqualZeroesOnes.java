package hashing;

import java.util.HashMap;

public class LongestSubArrayWithEqualZeroesOnes {

    public static int longestSubArrayWithEqualZeroesOnesNaive(int arr[], int n){

        int res = 0;

        // Traverse through every sub array and find the number of 0s and 1s
        // Return the maximum length sub array

        for(int i=0; i<n; i++){
            int c0=0, c1=0;
            
            // Consider every sub array that begins with arr[i]
            for(int j=i; j<n; j++){
                if(arr[j] == 0)
                    c0++;
                else 
                    c1++;

                if(c0 == c1){
                    res = Math.max(res, c0+c1);
                }
            }

        }

        return res;

    }


    public static int longestSubArrayWithEqualZeroesOnes(int arr[], int n){

        // Replace all 0s in the array with -1
        for(int i=0; i<n; i++){
            if(arr[i] == 0)
                arr[i] = -1;
        }

        // Use Length of Longest Sub Array with given Sum = 0
        int res = 0, sum = 0, preSum=0;

        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0; i<n; i++){
            // Compute the preSum
            preSum = preSum + arr[i];

            // Check if preSum == given sum
            if(preSum == sum)
                res = i+1;

            // Check if hash map does not contain preSum
            if(h.containsKey(preSum) == false){
                h.put(preSum, i);
            }

            // Check if preSum-sum is present in hash map as a key
            if(h.containsKey(preSum - sum)){
                res = Math.max(res, i-h.get(preSum - sum));
            }
        }

        return res;



    }

    public static void main(String args[]){

        int arr[] ={1,1,1,0,1,0};
		int result = longestSubArrayWithEqualZeroesOnes(arr, arr.length);
        System.out.println(result);
		
    }
    
}
