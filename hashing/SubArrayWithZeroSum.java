package hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public static boolean subArrayWithZeroSumNaive(int arr[], int n){

        for(int i=0; i<n; i++){
            int curr_sum=0;
            for(int j=i; j<n; j++){
                curr_sum = curr_sum + arr[j];
                if(curr_sum == 0)
                    return true;
            }
        }
        return false;

    }


    public static boolean subArrayWithZeroSum(int arr[], int n){

        int pre_sum =0;
        HashSet<Integer> h = new HashSet<>();

        // Traverse through the Array from L --> R
        for(int i=0; i<n; i++){

            // Compute Prefix Sum for every element arr[i]
            pre_sum = pre_sum + arr[i];

            if(h.contains(pre_sum))
                return true;

            // Handle Case when whole Prefix has sum = 0
            if(pre_sum == 0)
                return true;

            h.add(pre_sum);
        }

        return false;

    }


    public static void main(String args[]){

        int[] arr={1,4,13,-3,-10,5};
        System.out.println(subArrayWithZeroSum(arr, arr.length));
        
    }
    
}
