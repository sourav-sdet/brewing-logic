package arrays;

public class PrefixSum {

    public static int getSum(int arr[], int l, int r){

        // Pre Processing
        // Compute the Prefix Sum Array
        int pSum[] = new int[arr.length];
        pSum[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            pSum[i] = pSum[i-1] + arr[i];
        }


        // Query
        if(l == 0)
            return pSum[r];
        else 
            return pSum[r] - pSum[l-1];
    }




    public static void main(String args[]){

        int arr[] ={2,8,3,9,6,5,4};
        System.out.println(getSum(arr,0, 2));
		
    }
    
}
