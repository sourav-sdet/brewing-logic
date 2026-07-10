package searching;

public class BinarySearchIterative {

    public static int binarySearchIterative(int arr[], int n, int x){

        int low=0, high=n-1;

        while(low <= high){
            int mid = (low + high)/2;

            if(x == arr[mid])
                return mid;
            else if(x > arr[mid])
                low = mid+1;
            else
                high = mid-1;
        }

        return -1;
    }


    public static int binarySearchRecursive(int arr[], int low, int high, int x){
        // BASE CASE
        if (low > high)
            return -1;

        int mid = (low + high)/2;

        if(arr[mid] == x)
            return mid;
        else if(x < arr[mid])
            return binarySearchRecursive(arr, low, mid-1, x);
        else
            return binarySearchRecursive(arr, mid+1, high, x);

    }


    public static void main(String args[]){

        int arr[] ={10,20,30,40,50,60};
        //int result = binarySearchIterative(arr, arr.length,70);
        int result = binarySearchRecursive(arr, 0,arr.length-1,20);
        System.out.println(result);
        
		
    }
    
}
