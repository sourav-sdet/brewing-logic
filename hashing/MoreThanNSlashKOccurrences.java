package hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
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

    public static void moreThanNSlashKOccurrencesMoores(int arr[], int n, int k){
        // This is the expected approach for small k value
        // Extension to Moore's Voting Algorithm
        // TWO PHASES
        // PHASE 1: FIND THE CANDIDATE ELEMENTS

        // Create an empty map
        HashMap<Integer,Integer> h = new HashMap<>();

        // Traverse through the array arr from L --> R
        for(int i=0; i<n; i++){

            // if arr[i] is already present in map, increment its frequency count
            if(h.containsKey(arr[i])){
                h.put(arr[i], h.get(arr[i]) + 1);
            }

            // if arr[i] is not present in map and map has space (size < k), insert it to map with freq=1
            else if(h.size() < k-1){
                h.put(arr[i], 1);
            }

            // if arr[i] is not present in map and map has no space
            else {
                // Decrement all element frequencies by 1
                Iterator<Map.Entry<Integer, Integer>> iter = h.entrySet().iterator();
                while(iter.hasNext()){
                    Map.Entry<Integer, Integer> entry = iter.next();
                    int freq = entry.getValue() -1;

                    if(freq == 0)
                        iter.remove();
                    else 
                        entry.setValue(freq);
                }
                
            }

        }



        // PHASE 2: Print elements whose frequency is greater than n/k
        for(Map.Entry<Integer, Integer> e: h.entrySet()){
            if(e.getValue() > (n/k))
                System.out.println(e.getKey());
        }
    }

    public static void main(String args[]){
        int arr[] = {30,10,20,20,20,10,40,30,30};
        moreThanNSlashKOccurrencesMoores(arr, arr.length, 4);
    }
}
