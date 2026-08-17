package sorting;

import sorting.*;

public class MergeSort {

    public static void mergeSort(int a[], int l, int r){

        // Check if at least 2 elements exist in the input array
        if(r > l){

            // Calculate m
            int m = l + (r-l)/2;

            mergeSort(a, l, m);
            mergeSort(a, m+1, r);
            MergeFunction.merge(a, l, m, r);

        }


    }
    


    public static void main(String args[]){
        int[] a = {10,20,40,20,30};
        mergeSort(a, 0, a.length-1);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }


    
}
