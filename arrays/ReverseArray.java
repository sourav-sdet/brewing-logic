package arrays;

public class ReverseArray {


    // Two Pointer Approach
    public static void reverseArray(int arr[], int n){

        int low=0, high = n-1;

        // Even: low and high will cross each other
        // Odd: low and high at same index
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }
    }

    public static void main(String args[]){

        int arr[]={1,2,3,4,5,6,7,8,9};

		reverseArray(arr, arr.length);
		for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
		
    }
    
    
}
