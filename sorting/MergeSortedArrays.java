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



    public static void merge(int[] a, int[] b, int m, int n){

        // Traverse through both arrays simultaneously using two index variables i and j
        int i=0, j=0;

        while(i<m && j<n){

            if(a[i] <= b[j]){
                System.out.println(a[i]);
                i++;
            }
            else{
                System.out.println(b[j]);
                j++;
            }

        }

        while(i < m){
            System.out.println(a[i]);
            i++;
        }

        while(j < n){
            System.out.println(b[j]);
            j++;
        }



    }


    public static void main(String args[]){

        int[] a = {10,15,20,20};
        int[] b = {1,12};
        merge(a,b, a.length, b.length);

    }


    
}
