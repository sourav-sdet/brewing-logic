package arrays;

public class CheckIfArraySorted {

    // Array is sorted in non-decreasing order - increasing order and equals are allowed
    public static boolean isArraySortedNaive(int arr[], int n){

        // For every element, check if there is a smaller element on the right side
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(arr[j] < arr[i])
                    return false;
            }
        }

        return true;
    }

    public static boolean isArraySorted(int arr[], int n){

        // For every element, check if it is smaller than the previous element
        // Consider array as a stream of data
        for(int i=1; i<n; i++){
            if(arr[i] < arr[i-1])
                return false;

        }

        return true;
    }

    public static void main(String args[]){

		int arr[]={5,7,2,8,10,9};
        //int arr[]={1,2,3,4,5,6,7,8,9};

		boolean result=isArraySorted(arr, arr.length);
		System.out.println(result);
		
    }
    
}
