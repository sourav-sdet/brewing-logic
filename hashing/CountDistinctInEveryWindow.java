package hashing;

public class CountDistinctInEveryWindow {

    public static void countDistinctEveryWindowNaive(int arr[], int n, int k){

        // k= Window Size, k<=n
        // n= Array Length
        // Total Number of Windows = n-k+1

        // Traverse through all Windows
        for(int i=0; i<=n-k; i++){
            int count =0;
            // Traverse through all elements of every window
            for(int j=0; j<k; j++){
                // For every element arr[j], check if it is seen before
                boolean flag = false;
                for(int p=0; p<j; p++){
                    if(arr[i+j] == arr[i+p]){
                        flag = true;
                        break;
                    }
                }
                if(flag == false)
                    count++;

            }
            System.out.println(count + " ");


        }
    }


    public static void main(String args[]){

        // Two Binary Arrays
        int arr[] = {10,10,5,3,20,5};
        countDistinctEveryWindowNaive(arr, arr.length, 4);
    }
    
}
