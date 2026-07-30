package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MoreThanNSlashKOccurrences {
    
    public static void moreThanNSlashKOccurrencesNaive(int arr[], int n, int k){

        // Sort the Array ==> All occurrences of every element come together
        Arrays.sort(arr);

        int i=1, count=1;
        while(i < n){
            while(i < n && arr[i] == arr[i-1]){
                count ++;
                i++;
            }

            if(count > n/k){
                System.out.println(arr[i-1] + " ");
            }

            count = 1;
            i++;
        }




    }

    public static void moreThanNSlashKOccurrences(int arr[], int n, int k){

        // Use a HashMap to store array element as KEY and its frequency as VALUE
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Traverse through the array and insert array elements and its frequencies into HashMap
        for(int i=0; i<n; i++){
            freq.put( arr[i], freq.getOrDefault(arr[i], 0)+1);
        }

        // Iterate through the HashMap and check if frequency of any element is > n/k
        for( Map.Entry<Integer, Integer> entry: freq.entrySet() )
            if(entry.getValue() > (n/k))
                System.out.println(entry.getKey());

    }


    public static void main(String args[]){
        int arr[] = {10,10,20,30,20,10,10};
        moreThanNSlashKOccurrences(arr, arr.length, 2);
    }
}
