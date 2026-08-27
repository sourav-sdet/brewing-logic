package sorting;

public class MinimumDifferenceInArray {

    public static int getMinDifferenceNaive(int arr[], int n){

        int minDiff = Integer.MAX_VALUE;

        for(int i=0; i<n-1; i++){

            for(int j=i+1; j<n; j++){

                minDiff = Math.min( Math.abs(arr[j] - arr[i]), minDiff);
            }
        }

        return minDiff;

    }

    public static void main(String args[]){

        //int arr[] = {1,8,12,5,18};
        int arr[] = {5,3,8};
        System.out.println(getMinDifferenceNaive(arr, arr.length));

    }
    
}
