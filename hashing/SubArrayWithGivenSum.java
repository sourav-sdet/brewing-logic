package hashing;

public class SubArrayWithGivenSum {

    
    public static boolean subArrayWithGivenSumNaive(int arr[], int n, int sum){

        for(int i=0; i<n; i++){
            int curr_sum = 0;
            for(int j=i; j<n; j++){
                curr_sum += arr[j];
                if(curr_sum == sum)
                    return true;
            }
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]){

        int[] arr={5,8,6,13,3,-1};
        System.out.println(subArrayWithGivenSumNaive(arr, arr.length, 22));
        
    }


    
}
