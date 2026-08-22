package sorting;

import java.util.Arrays;

public class KthSmallestElement {

    public static int kthSmallestElementNaive(int arr[], int n, int k){

        // Sort the array
        Arrays.sort(arr);

        return arr[k-1];


    }




    public static void main(String args[]){
        int arr[] = {10,3,5,20};
        System.out.println(kthSmallestElementNaive(arr, arr.length, 2));
    }
    
}
