package sorting;

public class SortArrayWithTwoTypes {

    public static void segregatePositiveNegativeNaive(int arr[], int n){

        // Create a temp array of size n
        int temp[] = new int[n], i=0;

        // Traverse through input array, copy all negative elements to temp
        for(int j=0; j<n; j++){
            if(arr[j] < 0){
                temp[i] = arr[j];
                i++;
            }
        }

        // Traverse through input array, copy all positive elements to temp
        for(int j=0; j<n; j++){
            if(arr[j] >= 0){
                temp[i] = arr[j];
                i++;
            }
        }

        // Copy elements from temp to arr
        for(int j=0; j<n; j++){
            arr[j] = temp[j];
        }


    }


    public static void segregatePositiveNegative(int arr[], int n){

        // Use Partition function of Quick Sort
        // Either use Lomuto Partition or Hoare Partition
        // Implementation using Hoare Partition

        int i=-1, j=n;

        while(true){

            do { i++; } while( arr[i] < 0 );
            do { j--; } while( arr[j] >=0 );

            if(i >= j){
                return;
            }

            // Swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;


        }


    }



    public static void main(String args[]){

        int arr[] = {13,-12,18,10};
        segregatePositiveNegative(arr, arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
    
}
