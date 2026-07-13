package searching;

public class TripletSumSortedArray {

    public static boolean isTripletSumNaive(int arr[], int n, int sum){

        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                for(int k=j+1; k<n; k++){
                    if(arr[i] + arr[j] + arr[k] == sum)
                        return true;
                }
            }
        }
        return false;


    }


    public static boolean isPairSum(int arr[], int n, int sum, int s){

        // TWO POINTER TECHNIQUE
        int left = s, right = n-1;

        while(left < right){
            if(arr[left] + arr[right] == sum)
                return true;
            else if(arr[left] + arr[right] > sum)
                right --;
            else
                left ++;
        }
        return false;


    }


    public static boolean isTripletSum(int arr[], int n, int sum){

        for(int i=0; i< n-2; i++){
            if(isPairSum(arr, n, sum-arr[i], i+1))
                return true;
        }
        return false;

    }

    public static void main(String args[]){

        int arr[]={2,4,8,9,20,40};
        boolean result = isTripletSum(arr, arr.length,32 );
        System.out.println(result);

    }
    
}
