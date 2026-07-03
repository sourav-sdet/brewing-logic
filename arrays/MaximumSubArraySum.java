package arrays;

public class MaximumSubArraySum {

    public static int maxSubArraySumNaive(int arr[], int n){

        int maxSum = arr[0];

        for(int i=0; i<n; i++){
            int currSum=0;
            for(int j=i; j<n; j++){
                currSum +=arr[j];
                maxSum=Math.max(maxSum, currSum);
            }
        }
        return maxSum;

    }


    public static int maxSubArraySum(int arr[], int n){

        int maxSum=arr[0];
        int maxEnding=arr[0];

        for(int i=1; i<n; i++){

            maxEnding = Math.max(maxEnding+arr[i], arr[i]);
            maxSum = Math.max(maxEnding, maxSum);

        }

        return maxSum;

    }


    public static void main(String args[]){

        int arr[] ={-3,8,-2,4,-5,6};

		int result = maxSubArraySum(arr, arr.length);
        System.out.println(result);
		
    }

    
}
