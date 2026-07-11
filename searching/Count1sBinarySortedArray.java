package searching;

public class Count1sBinarySortedArray {


    public static int count1s(int arr[], int n){

        // BINARY SEARCH
        int low=0, high=n-1;

        while(low <=high){

            int mid = (low + high)/2;

            if(arr[mid] == 0) // Go to the right side
                low = mid+1;
            else{ // arr[mid] == 1
                // Check if its the first occurrence
                if(mid == 0 || arr[mid] != arr[mid-1]) 
                    return n-mid;
                else // Go the left side to find the first occurrence
                    high = mid-1; 

            }


        }

        return -1;


    }

    public static void main(String args[]){

        int arr[] ={0,0,0,1,1,1,1,1,1};
        
        int result = count1s(arr, arr.length);
        System.out.println(result);		
    }
    
}
