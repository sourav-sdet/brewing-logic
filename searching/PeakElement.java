package searching;

public class PeakElement {

    public static int peakElementNaive(int arr[], int n){

        if(n==1) return arr[0];
        if(arr[0] >= arr[1]) return arr[0];
        if(arr[n-1] >= arr[n-2]) return arr[n-1];

        for(int i=1; i<n-1; i++){

            if ((arr[i] >= arr[i-1]) && (arr[i] >= arr[i+1]))
                return arr[i];
        }
        return -1;

    }

    public static int peakElement(int arr[], int n){

        int low=0, high=n-1;
        while(low <= high){

            int mid = (low + high)/2;

            // Check if mid is a peak element
            if ((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid+1] <= arr[mid]))
                return arr[mid];

            // If mid is not peak element, check if left of mid is greater or equal to mid
            if( mid > 0 && arr[mid -1] >= arr[mid])
                high = mid -1;
            else 
                low = mid +1;

        }
        return -1;

    }


    public static void main(String args[]){

        int arr[]={6,7,8,20,12};
        int result = peakElement(arr, arr.length);
        System.out.println(result);

    }
    
}
