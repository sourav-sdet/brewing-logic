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



    public static boolean isPairSum(int arr[], int n, int sum){

        // TWO POINTER TECHNIQUE
        int left = 0, right = n-1;

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

    public static void main(String args[]){

        int arr[]={2,4,8,9,11,12,20,30};
        boolean result = isPairSumNaive(arr, arr.length,23 );
        System.out.println(result);

    }
    
}
