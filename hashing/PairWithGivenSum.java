package hashing;

import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean isPairSumNaive(int arr[], int sum){

        // Consider all possible pairs one by one and check its sum
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == sum)
                    return true;
            }
        }
        return false;
    }



    public static boolean isPairSum(int arr[], int sum){

        HashSet<Integer> h = new HashSet<>();

        // Traverse through the input array
        for(int x: arr){

            // First check if sum - x is present in the HashSet
            if(h.contains(sum - x))
                return true;
            else 
                h.add(x);

        }

        return false;

    }



    public static void main(String args[]){

        int[] arr={8,3,4,2,5};
        System.out.println(isPairSumNaive(arr, 6));
        


    }
    
}
