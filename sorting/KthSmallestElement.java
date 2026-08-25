package sorting;

import java.util.Arrays;

public class KthSmallestElement {

    public static int kthSmallestElementNaive(int arr[], int n, int k){

        // Sort the array
        Arrays.sort(arr);

        return arr[k-1];


    }


    // For efficient approach, use Lomuto Partition of Quick Sort
    public static int kthSmallestElemen(int arr[], int n, int k){
        int low = 0, high =n-1;

        while(low <= high){

            // Compute p using partition function of Quick Sort (Lomuto Partition)
            int p = lomutoPartition(arr, low, high);

            if(p == k-1)
                return p;
            else if(p > k-1)
                high = k-1;
            else
                low = p+1;

        }

        return -1;
    }


    public static int lomutoPartition(int arr[], int low, int high){

        // Lomuto Partition Function of Quick Sort
        // We consider the last element as the pivot element
        int pivot = arr[high];

        // Window of smaller elements
        int i=low-1;

        // Traverse the input array from low to high-1 (since arr[high] is the pivot element)
        for(int j=low; j<=high-1; j++){

            if(arr[j] < pivot){

                // Increment the window of smaller elements by 1
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }


        }

        // Swap arr[i+1] and arr[h] (pivot element)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1; // index of pivot element

    }




    public static void main(String args[]){
        int arr[] = {10,3,5,20};
        System.out.println(kthSmallestElementNaive(arr, arr.length, 2));
    }
    
}
