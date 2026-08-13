package sorting;

public class BubbleSort {

    public static void bubbleSort(int arr[], int n){

        // For an array of size n, n-1 passes are required
        // Compare Adjacent Elements
        // First Pass, Largest Element will be bubbled up to the last position
        // Second Pass, Second Largest Element will be bubbled up to the second last position

        // i - number of passes
        for(int i=0; i<n-1; i++){

            // j - to compare adjacent elements
            // Optimization 1 - If we are at ith iteration, i elements are already fixed to their
            // respective positions - i largest elements

            // Optimation 2 - If array is already sorted/becomes sorted mid way
            boolean flag = false;

            for(int j=0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){

                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = true;
                }
            }

            if(flag == false)
                break;

        }


    }


    public static void main(String args[]){

        int[] arr = {10,8,20,5};
        bubbleSort(arr,arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    
}
