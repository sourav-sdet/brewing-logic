package hashing;

public class LongestSubArrayWithGivenSum {

    public static int longestSubArrayWithGivenSumNaive(int arr[], int n, int sum){

        int res=0;

        // Consider all possible sub arrays
        for(int i=0; i<n; i++){
            int currSum = 0;

            // For every arr[i], find the sum of all sub arrays startig with this element
            for(int j=i; j<n; j++){
                currSum = currSum + arr[j];

                if(currSum == sum){
                    res = Math.max(res, j-i+1);
                }
            }


        }

        return res;

    }







    public static void main(String args[]){

        int arr[] ={5,2,3,4};
		int result = longestSubArrayWithGivenSumNaive(arr, arr.length, 5);
        System.out.println(result);
		
    }
    
}
