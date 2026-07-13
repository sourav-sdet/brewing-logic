package searching;

public class IsPairSumSortedArray {


    public static boolean isPairSumNaive(int arr[], int n, int sum){

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] + arr[j] == sum)
                    return true;
            }
        }
        return false;


    }


    public static void main(String args[]){

        int arr[]={2,3,8,11};
        boolean result = isPairSumNaive(arr, arr.length,14 );
        System.out.println(result);

    }
    
}
