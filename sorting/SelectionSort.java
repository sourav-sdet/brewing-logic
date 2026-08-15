package sorting;

public class SelectionSort {

    public static void selectionSortNaive(int arr[], int n){

        // Traverse through the input array
        // Find out the minimum element
        // Place it in temp array
        
        int temp[] = new int[n];

        for(int i=0; i<n; i++){
            int minIndex = 0;
            for(int j=1; j<n; j++){
                if(arr[j] < arr[minIndex] ){
                    minIndex = j;
                }
            }

            temp[i] = arr[minIndex];
            arr[minIndex] = Integer.MAX_VALUE;
        }

        // Copy values from temp to arr
        for(int i=0; i<n; i++){
            arr[i] = temp[i];
        }



    }

    public static void selectionSort(int arr[], int n){
        
        // Traverse through the input array
        // Find out the minimum element
        // Instead of storing it in a temp array, swap it with the current element

        // At any point, we maintain two parts- Sorted and Unsorted
        // We need to find out min element in the Unsorted Part

        // Elements from 0 to i are sorted
        // Elements from i+1 to n-1 are yet to be sorted
        for(int i=0; i<n-1; i++){

            // Find min element from Unsorted part
            int minIndex=i;
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[minIndex])
                    minIndex = j;
            }

            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;

        }



    }



    public static void main(String args[]){

        int[] arr = {10,5,8,20,2,18};
        selectionSortNaive(arr,arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    
}
