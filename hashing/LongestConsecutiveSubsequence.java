package hashing;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {

    public static int longestConsecutiveSubsequenceNaive(int arr[], int n){

        int maxLen=1;
        int currLen=1;

        // Sort the Array
        Arrays.sort(arr);

        // Traverse through the array from L -> R
        for(int i=1; i<n-1; i++){
            if(arr[i-1] + 1 == arr[i]){
                currLen++;
            }
            else if(arr[i] != arr[i-1]) {
                maxLen = Math.max(maxLen, currLen);
                currLen =1;
            }
        }

        return maxLen;


    }






    public static void main(String args[]){

        int arr[] = {1,9,3,4,2,20};
        System.out.println(longestConsecutiveSubsequenceNaive(arr, arr.length));
    }
    
}
