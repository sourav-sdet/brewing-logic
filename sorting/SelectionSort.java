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

    public static void main(String args[]){

        int[] arr = {10,8,20,5};
        selectionSortNaive(arr,arr.length);

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
    
}
