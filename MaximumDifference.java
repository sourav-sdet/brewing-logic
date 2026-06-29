public class MaximumDifference {


    public static int maximumDifferenceNaive(int arr[],int n){

        int maxDiff = arr[1] - arr[0];
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j< n; j++){
                maxDiff = Math.max(maxDiff, arr[j] - arr[i]);
            }
        }
        return maxDiff;

    }


    public static int maximumDifference(int arr[], int n){

        int maxDiff=arr[1] - arr[0], minVal=arr[0];

        for(int j=1; j<n; j++){
            maxDiff = Math.max(maxDiff, arr[j] - minVal);
            minVal = Math.min(minVal, arr[j]);
        }
        return maxDiff;

    }


    public static void main(String args[]){

        int arr[] ={2,3,10,6,4,8,1};
        
        //int result= maximumDifferenceNaive(arr, arr.length);
        int result= maximumDifference(arr, arr.length);
        System.out.println(result);
		
    }
    
}
