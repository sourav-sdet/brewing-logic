package arrays;

public class TrappingRainWater {


    public static int findUnitsOfWaterStored(int arr[], int n){

        int result=0;

        // Compute lMax
        int lMax[] = new int[n];
        lMax[0] = arr[0];
        for(int i=1; i<n; i++){
            lMax[i] = Math.max(lMax[i-1], arr[i]);
        }

        // Compute rMax
        int rMax[] = new int[n];
        rMax[n-1] = arr[n-1];
        for(int i=n-2; i>=0; i--){
            rMax[i] = Math.max(rMax[i+1], arr[i]);
        }

        // Compute units of water stored
        for(int i=0; i<n; i++){
            result = result + (Math.min(lMax[i], rMax[i]) - arr[i]);
        }

        return result;

    }


    public static void main(String args[]){

        int arr[] ={3,0,1,0,4,0,2};
        
        int result= findUnitsOfWaterStored(arr, arr.length);
        System.out.println(result);
		
    }

    


    
}
