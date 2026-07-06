package arrays;

public class MaximumLengthEvenOddSubArray {



    public static int maxLenEvenOddSubArrayNaive(int arr[], int n){

        int maxLen=1;

        for(int i=0; i<n; i++){

            int currLen=1;
            for(int j=i+1;j<n; j++){

                if((arr[j]%2 == 0 && arr[j-1]%2 !=0) || (arr[j]%2 != 0 && arr[j-1] %2 ==0))
                {
                    currLen++;
                }
                else
                    break;
            }
            maxLen = Math.max(currLen, maxLen);

        }
        return maxLen;


    }



    public static int maxLenEvenOdd(int arr[], int n){

        // Based on Kadane's Algorithm
        int maxLen=1, currLen=1;

        for(int i=1; i<n; i++){

            if((arr[i]%2 == 0 && arr[i-1]%2 !=0) || (arr[i]%2 != 0 && arr[i-1] %2 ==0)){
                currLen++;
                maxLen=Math.max(maxLen, currLen);
            }
            else
                currLen=1;

        }
        return maxLen;

    }

    public static void main(String args[]){

        int arr[] ={5,10,20,6,3,8};
        
        //int result= maximumDifferenceNaive(arr, arr.length);
        int result= maxLenEvenOddSubArrayNaive(arr, arr.length);
        System.out.println(result);
		
    }
    
}
