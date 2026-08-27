package sorting;

import java.util.Arrays;

public class MinimumDifferenceInArray {

    public static int getMinDifferenceNaive(int arr[], int n){

        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<n-1; i++){

            for(int j=i+1; j<n; j++){

                minDiff = Math.min( Math.abs(arr[j] - arr[i]), minDiff);
            }
        }

        return minDiff;

    }


    public static int getMinDifference(int arr[], int n){

        int minDiff = Integer.MAX_VALUE;

        // Step 1: Sort the Input Array
        Arrays.sort(arr);

        for(int i=1; i<n; i++){
            minDiff = Math.min( Math.abs(arr[i] - arr[i-1]), minDiff);
        }

        return minDiff;
        
    }

    public static void main(String args[]){

        int arr[] = {1,8,12,5,18};
        //int arr[] = {5,3,8};
        System.out.println(getMinDifference(arr, arr.length));

    }
    
}
