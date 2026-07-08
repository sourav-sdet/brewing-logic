package arrays;

public class SubArrayWithGivenSum {

    public static boolean subArrayWithGivenSumNaive(int arr[], int n, int sum){

        // Go through every sub array, find the sum, compare it with given sum
        for(int i=0; i<n; i++){
            int currSum=0;
            for(int j=i; j<n; j++){
                currSum = currSum + arr[j];
                if(currSum == sum)
                    return true;
            }
        }
        return false;

    }

    // Window Sliding, with a VARIABLE SIZE WINDOW
    public static boolean subArrayWithGivenSum(int arr[], int n, int sum){
        int s=0, currSum=0;

        for(int e=0; e<n; e++){
            currSum = currSum + arr[e];

            while(currSum > sum){
                currSum = currSum - arr[s];
                s++;
            }

            if(currSum == sum) 
                return true;
        }

        return false;

    }





    public static void main(String args[]){

        int arr[] ={1,4,20,6,10,5};
        System.out.println(subArrayWithGivenSum(arr, arr.length, 33));
		
    }
    
}
