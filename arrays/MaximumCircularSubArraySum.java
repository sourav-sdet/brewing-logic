package arrays;

public class MaximumCircularSubArraySum {


    // MAXIMUM SUB-ARRAY SUM USING KADANE's ALGORITHM
    public static int maxNormalSubArraySum(int arr[], int n){

        int maxSum=arr[0];
        int maxEnding=arr[0];

        for(int i=1; i<n; i++){

            maxEnding= Math.max(maxEnding+arr[i], arr[i]);
            maxSum=Math.max(maxEnding, maxSum);
        }
        return maxSum;

    }



    public static int maxCircularSubArraySum(int arr[], int n){
        

        // COMPUTE MAX NORMAL SUM USING KADANE's ALGORITHM
        int maxNormal = maxNormalSubArraySum(arr, n);

        if(maxNormal < 0)
            return maxNormal;

        // COMPUTE THE ARRAY SUM AND INVERT ARRAY ELEMENTS
        int arrSum=0;
        for(int i=0; i<n; i++){
            arrSum +=arr[i];
            arr[i] = -arr[i];
        }


        // COMPUTE MAXIMUM CIRCULAR SUB-ARRAY SUM USINH STANDARD KADANEs's ALGORITHM
        int maxCircular = arrSum + maxNormalSubArraySum(arr, n);

        return Math.max(maxNormal, maxCircular);

    }


    public static void main(String args[]){

        int arr[] ={8,-4,3,-5,4};
        
        //int result= maximumDifferenceNaive(arr, arr.length);
        int result= maxCircularSubArraySum(arr, arr.length);
        System.out.println(result);
		
    }
    
}
