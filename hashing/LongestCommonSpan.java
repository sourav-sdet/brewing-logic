package hashing;

import java.util.HashMap;

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


    public static int longestCommonSpan(int arr1[], int arr2[]){

        int n= arr1.length;

        // STEP 1: Create an aux array temp[] to store arr1[] - arr2[]
        int temp[]=new int[n];
        for(int i=0; i<n; i++){
            temp[i] = arr1[i] - arr2[i];
        }

        // STEP 2: Use length of longest sub array with given sum =0 in temp
        int res = 0;
        int preSum =0;
        int sum=0;
        HashMap<Integer, Integer> h = new HashMap<>();

        for(int i=0; i<n; i++){
            preSum = preSum + temp[i];

            if(preSum ==0)
                res=i+1;

            if(h.containsKey(preSum) == false)
                h.put(preSum, i);

            if(h.containsKey(preSum - sum)){
                res = Math.max(res, i-h.get(preSum-sum));
            }
        }

        return res;


    }



    public static void main(String args[]){

        // Two Binary Arrays
        int arr1[] = {0,1,0,0,0,0};
        int arr2[] = {1,0,1,0,0,1};
        int result = longestCommonSpan(arr1, arr2);
        System.out.println(result);
    }


    
}
