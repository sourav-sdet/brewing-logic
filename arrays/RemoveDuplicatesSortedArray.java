package arrays;
public class RemoveDuplicatesSortedArray {
    
    public static int removeDuplicatesNaive(int arr[], int n){

        // Create a temporary array of size n as all the elements in the input array can be unique
        int temp[] = new int[n];

        // First element will always be a part of the result as it is always unique
        temp[0] = arr[0];

        // Initialize the size of result
        int i=1;

        // Traverse through the array starting from index 1
        for(int j=1; j<n; j++){
            // Check if the current element is same as the previously copied element, if no, then copy it to temp
            if(arr[j] != temp[i-1]){
                temp[i] = arr[j];
                i++;
            }
        }

        // Copy the temp array elements into the original array
        for(int j=0; j<i; j++){
            arr[j] = temp[j];
        }

        return i;
    }




    public static int removeDuplicates(int arr[], int n){

        // Two Pointer Approach

        // First element is always a part of the array, so size is initialized to 1
        int i=1;

        for(int j=1; j<n; j++){

            // Check if the current element is same as previous element
            if(arr[j] != arr[i-1]){
                arr[i] = arr[j];
                i++;
            }
        }

        return i;



    }



    public static void main(String args[]){

        int arr[] ={1,2,3,3,3,4,4,5,5,6,7,8};
        //int arr[] = {1,1,1};

		int result = removeDuplicatesNaive(arr, arr.length);
        System.out.println(result);
		
    }
}
