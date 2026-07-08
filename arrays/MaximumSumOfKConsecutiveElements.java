package arrays;

public class MaximumSumOfKConsecutiveElements {

    public static int maxSumNaive(int arr[], int n, int k){

        int maxSum=Integer.MIN_VALUE;

        for(int i=0; i+ k-1 <n; i++){
            int currSum=0;
            for(int j=0; j<k; j++){
                currSum += arr[i+j];
            }
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }


    public static int maxSum(int arr[], int n, int k){

        int currSum = 0;
        //Compute the sum of first k elements
        for(int i=0; i<k; i++){
            currSum += arr[i];
        }

        int maxSum = currSum;
        for(int i=k; i<n; i++){
            currSum =currSum + arr[i] - arr[i-k];
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;

    }



    public static void main(String args[]){

        int arr[] ={1,8,30,-5,20,7};
        int result = maxSum(arr, arr.length, 4);
        System.out.println(result);
		
    }
    
}
