package hashing;

public class PairWithGivenSum {

    public static boolean isPairNaive(int arr[], int sum){

        // Consider all possible pairs one by one and check its sum
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == sum)
                    return true;
            }
        }
        return false;
    }







    public static void main(String args[]){

        int[] arr={8,3,9,4};
        System.out.println(isPairNaive(arr, 20));
        


    }
    
}
