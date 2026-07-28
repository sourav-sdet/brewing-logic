package hashing;

public class LongestSubArrayWithEqualZeroesOnes {

    public static int longestSubArrayWithEqualZeroesOnesNaive(int arr[], int n){

        int res = 0;

        // Traverse through every sub array and find the number of 0s and 1s
        // Return the maximum length sub array

        for(int i=0; i<n; i++){
            int c0=0, c1=0;
            
            // Consider every sub array that begins with arr[i]
            for(int j=i; j<n; j++){
                if(arr[j] == 0)
                    c0++;
                else 
                    c1++;

                if(c0 == c1){
                    res = Math.max(res, c0+c1);
                }
            }

        }

        return res;

    }




    public static void main(String args[]){

        int arr[] ={1,1,1,0,1,0};
		int result = longestSubArrayWithEqualZeroesOnesNaive(arr, arr.length);
        System.out.println(result);
		
    }
    
}
