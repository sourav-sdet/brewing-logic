package sorting;

public class LomutoPartition {

    public static int lomutoPartition(int arr[], int l, int h){

        // Here assumption is that last element is always the pivot
        int p = arr[h];
        
        // Window of smaller elements
        int i= l-1;

        // Traverse the input array arr from l to h-1 (since arr[h] is the pivot element)
        for(int j=l; j<=h-1; j++){

            // Is a smaller element is seen
            if(arr[j] < p){

                // Increment the window of smaller elements by 1
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        // Swap arr[i+1] and arr[h] (pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;

        return i+1;

    }

    public static void main(String args[]){

        int arr[] = {10,80,30,90,40,50,70};
        System.out.println(lomutoPartition(arr, 0, arr.length-1));
        
    }


    
}
