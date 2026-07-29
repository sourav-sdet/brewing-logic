package hashing;

import java.util.HashMap;

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

    public static void countDistinctEveryWindow(int arr[], int n, int k){
        
        HashMap<Integer, Integer> freqMap = new HashMap<>();

        // Compute the freqMap of first window elements
        for(int i=0; i<k; i++){
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0)+1);
        }

        // Print the size of freqMap
        System.out.println(freqMap.size());

        // Traverse through the remaining windows
        for(int i=k; i<n; i++){

            // Decrease the frequency of arr[i-k]
            freqMap.put(arr[i-k], freqMap.get(arr[i-k])- 1);

            // if the frequency equals 0, remove it from freqMap
            if(freqMap.get(arr[i-k]) == 0)
                freqMap.remove(arr[i-k]);

            // If arr[i] does not exist in the freqMap, insert it. Else, increase it frequency
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0)+1);

            System.out.println(freqMap.size());
        }



    }

    public static void main(String args[]){

        // Two Binary Arrays
        int arr[] = {10,20,10,10,30,40};
        countDistinctEveryWindow(arr, arr.length, 4);
    }
    
}
