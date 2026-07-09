package arrays;

public class EquilibriumPoint {

        public static boolean equilibriumPointNaive(int arr[], int n){

            for(int i=0; i<n; i++){
                int lSum=0, rSum=0;

                // Compute lSum - sum of elements from 0 to i-1
                for(int j=0; j<i; j++){
                    lSum+=arr[j];
                }

                // Compute rSum - sum of elements from i+1 to n-1
                for(int j=i+1; j<n; j++){
                    rSum+=arr[j];
                }

                if(lSum == rSum)
                    return true;

            }

        return false;

        }

        public static void main(String args[]){

        int arr[] ={3,4,8,-9,9,7};
        System.out.println(equilibriumPointNaive(arr,arr.length));
		
    }
    
}
