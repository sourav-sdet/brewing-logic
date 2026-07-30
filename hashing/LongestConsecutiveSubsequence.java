package hashing;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {

    public static int longestConsecutiveSubsequenceNaive(int arr[], int n){

        int maxLen=1;
        int currLen=1;

        // Sort the Array
        Arrays.sort(arr);

        // Traverse through the array from L -> R
        for(int i=1; i<n; i++){
            if(arr[i-1] + 1 == arr[i]){
                currLen++;
            }
            else if(arr[i] != arr[i-1]) {
                maxLen = Math.max(maxLen, currLen);
                currLen =1;
            }
        }

        return Math.max(maxLen,currLen);


    }


    public static int longestConsecutiveSubsequence(int arr[], int n){

        // STEP 1: Insert all array elements into a HashSet
        HashSet<Integer> h = new HashSet<>();

        for(int i=0; i<n; i++){
            h.add(arr[i]);
        }

        // STEP 2: Perform 2n look ups to find the result
        // Iterate through every element in the HashSet
        int res=1;
        for(Integer x: h){

            // Check if x is a beginning element of the subsequence ==> x-1 should not be present
            // If x-1 is present, ignore this element
            if(h.contains(x-1) == false){
                // It is the beginning of a subsequence
                int curr = 1;
                while(h.contains(x+curr))
                    curr++;
                res = Math.max(curr, res);
            }


        }

        return res;

    }



    public static void main(String args[]){

        int arr[] = {1,9,3,4,2,20};
        System.out.println(longestConsecutiveSubsequenceNaive(arr, arr.length));
    }
    
}
