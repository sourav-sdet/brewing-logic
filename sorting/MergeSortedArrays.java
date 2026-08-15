package sorting;

import java.util.Arrays;

public class MergeSortedArrays {

    public static void mergeNaive(int []a, int []b, int m, int n){

        // Create a temp array of size m+n
        int temp[] = new int[m+n];

        // Copy elements of a to temp
        for(int i=0; i<m; i++){
            temp[i] = a[i];
        }

        // Copy elements of b to temp
        for(int i=0; i<n; i++){
            temp[m+i] = b[i];
        }

        // Sort temp array
        Arrays.sort(temp);

        // Print
        for(int i=0; i<(m+n); i++){
            System.out.println(temp[i]);
        }

    }

    public static void main(String args[]){

        int[] a = {10,15,20,20};
        int[] b = {1,12};
        mergeNaive(a,b, a.length, b.length);

    }


    
}
