package hashing;

public class LongestCommonSpan {

    public static int longestCommonSpanNaive(int arr1[], int arr2[]){

        int maxLen=0;
        int n=arr1.length;

        for(int i=0; i<n; i++){
            int sum1=0, sum2=0;

            // Consider every sub array starting with arr[i]
            for(int j=i; j<n; j++){
                sum1 = sum1 + arr1[j];
                sum2 = sum2 + arr2[j];

                if(sum1 == sum2){
                    maxLen = Math.max(maxLen, j-i+1);
                }
            }
        }
        return maxLen;


    }






    public static void main(String args[]){

        // Two Binary Arrays
        int arr1[] = {0,1,0,0,0,0};
        int arr2[] = {1,0,1,0,0,1};
        int result = longestCommonSpanNaive(arr1, arr2);
        System.out.println(result);
    }


    
}
