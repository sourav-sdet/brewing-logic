package searching;

public class AllocateMinPages {

    public static int allocateMinPagesNaive(int arr[], int n, int k){

        // If number of students k == 1, all the n books are read by a single student
        if(k == 1) return sum(arr, 0, n-1);

        // If number of books n == 1, return arr[0]
        if(n == 1) return arr[0];

        int result = Integer.MAX_VALUE;

        for(int i=1; i<n; i++){
            result = Math.min(result, Math.max(allocateMinPagesNaive(arr, i, k-1), sum(arr, i, n-1)));
        }

        return result;

    }

    public static int sum(int arr[], int s, int e){
        int sum = 0;
        for(int i=s; i<=e; i++){
            sum = sum + arr[i];
        }
        return sum;
    }


    public static int allocateMinPages(int arr[], int n, int k){

        // Compute the sum of array and max element of array
        int sum = 0, mx = 0;
        for(int i=0; i<n; i++){
            sum = sum + arr[i];
            mx = Math.max(mx, arr[i]);
        }

        // Binary Search from max to sum
        int low = mx, high = sum, result =0;

        while(low <= high){
            int mid = (low + high)/2;

            if(ifFeasible(arr, n, k , mid)){
                result = mid;
                high = mid -1;
            }
            else 
                low = mid + 1;

        }
        return result;


    }


    public static boolean ifFeasible(int arr[], int n, int k, int ans){

        int req=1, sum = 0;

        for(int i=0; i<n; i++){
            if(sum + arr[i] > ans){
                req ++;
                sum = sum + arr[i];
            }
            else 
                sum = sum + arr[i];
        }

        return (req <= k);
    }


    public static void main(String args[]){

        int arr[] = {10,20,30,40};
        int result = allocateMinPages(arr, arr.length, 2);
        System.out.println(result);
        	
    }
    
}
