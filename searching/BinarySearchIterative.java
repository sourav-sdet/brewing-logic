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


    public static void main(String args[]){

        int arr[] ={10,20,30,40,50,60};
        int result = binarySearchIterative(arr, arr.length,70);
        System.out.println(result);
        
		
    }
    
}
