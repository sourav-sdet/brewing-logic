package sorting;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static int chocolateDistribution(int arr[], int n, int m){

        // Corner Case
        if(m > n)
            return -1;

        // Sort the Array
        Arrays.sort(arr);

        int result = arr[m-1] - arr[0];

        // Traverse through each element of the array
        for(int i=1; (i+m-1) <n; i++){

            result = Math.min(arr[i+m-1] - arr[i], result);

        }

        return result;


    }


    public static void main(String args[]){

        int arr[] = {7,3,2,4,9,12,56};
        System.out.println(chocolateDistribution(arr, arr.length, 3));

    }
    
}
