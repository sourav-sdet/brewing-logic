package hashing;

import java.util.HashSet;

public class UnionUnsortedArrays {

    public static int union(int a1[], int a2[]){

        HashSet<Integer> hset = new HashSet<>();

        // Insert all elements of a1 to hset
        for(int i=0; i<a1.length; i++){
            hset.add(a1[i]);
        }

        // Insert all elements of a2 to hset
        for(int i=0; i<a2.length; i++){
            hset.add(a2[i]);
        }

        return hset.size();

    }


public static void main(String args[]){

        int[] arr1={10,20,30,5,6,7};
        int[] arr2={10,30,40};
        System.out.println(union(arr1, arr2));
        


    }
    
}
