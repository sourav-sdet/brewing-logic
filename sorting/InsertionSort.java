package sorting;

public class InsertionSort {

    public static void insertionSort(int arr[], int n){

        // For every array, maintain a sorted half and a non sorted half
        // Start iterating from the second element since first element is already sorted
        for(int i=1; i<n; i++){

            int key = arr[i];

            // For every i, go to its left side and find its correct position in the sorted half
            int j=i-1;

            // Move to the left side till elements are greater than key
            while(j >= 0 && arr[j] > key){

                // Move elements one position ahead
                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = key;
        }



    }

    public static void main(String args[]){

        int[] arr = {10,8,20,5};
        insertionSort(arr,arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }


    // Complexity Analysis
    // Best Case - Array is already sorted - O(n)
    // Worst Case - Array is reverse sorted - O(n^2)
    // In General: O(n^2)
    
}
