package searching;

public class SearchInSortedRotatedArray {


    public static int searchSortedRotatedArray(int arr[], int n, int x){


        int low=0, high=n-1;

        while(low <= high){

            int mid=(low + high)/2;

            if(arr[mid] == x)
                return mid;

            // Check whether left half of array or right half of array is sorted
            if(arr[low] <= arr[mid]) //Left half is sorted
                // Check if x lies in this range
                if(x >= arr[low] && x < arr[mid])
                    high = mid-1;
                else 
                    low = mid+1;
            
            else{  // Right half is sorted
                // Check if x lies in this range
                if(x > arr[mid] && x <= arr[high])
                    low = mid+1;
                else 
                    high = mid-1;
            }
        }

        return -1;

    }




    public static void main(String args[]){

        int arr[]={10,20,40,50,5,8};
        int result = searchSortedRotatedArray(arr, arr.length, 5);
        System.out.println(result);

    }
    
}
