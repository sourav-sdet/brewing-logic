package arrays;

public class TrappingRainWater {


    public static int maxWaterStoredNaive(int arr[], int n){

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


    public static int maxWaterStored(int arr[], int n){

        int totalWater=0;
        int l=0, r=n-1;

        //lMax will hold the largest value from arr[0] to arr[l]
        int lMax=arr[l];

        //rMax will hold the largest value from arr[n-1] to arr[r]
        int rMax=arr[r];

        while(l <= r){
            // rMax is smaller
            if(lMax >= rMax){
                totalWater += (rMax-arr[r]);
            

                r--;

                if(r>=0)
                    rMax=Math.max(rMax, arr[r]);
            }

            // lMax is smaller
            else{

                totalWater += (lMax-arr[l]);

                l++;

                if(l<n)
                    lMax= Math.max(lMax, arr[l]);


            }

        }
        return totalWater;



    }

    public static void main(String args[]){

        int arr[] ={3,0,1,0,4,0,2};
        
        //int result= maxWaterStoredNaive(arr, arr.length);
        int result= maxWaterStored(arr, arr.length);
        System.out.println(result);
		
    }

    


    
}
