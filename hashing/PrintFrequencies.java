package hashing;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequencies {

    public static void printFrequenciesNaive(int arr[], int n){

        
        for(int i=0; i<n; i++){
          boolean flag = false;
          
          // Check if the element has already appeared before
          for(int j=0; j<i; j++){
            if(arr[i] == arr[j]){
                flag = true;
                break;
            }
          }

          // If element has has appeared before, continue
          if(flag == true)
            continue;

          // If element has not appeared before
          int freq = 0;
          for(int j=i; j<n; j++){
            if(arr[i] == arr[j])
                freq++;
          }

          System.out.println(arr[i] + " "+ freq);



        }

    }


    public static void printFrequencies(int arr[], int n){

        HashMap<Integer, Integer> hmap = new HashMap<>();

        for(int x: arr){
            hmap.put(x, hmap.getOrDefault(x, 0)+1);
        }

        for(Map.Entry<Integer, Integer> e: hmap.entrySet()){
            System.out.println(e.getKey() + " "+ e.getValue());

        }

    }

    public static void main(String args[]){

        int[] arr={10,20,10,20,30};
        printFrequencies(arr, arr.length);
        


    }
    
}
