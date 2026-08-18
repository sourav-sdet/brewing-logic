package sorting;

import java.util.Arrays;

public class UnionSortedArrays {

    public static void unionNaive(int a[], int b[]){

        int m=a.length;
        int n=b.length;

        // Use Sorting
        int[] temp = new int[m+n];

        // Copy elements of a to temp
        for(int i=0; i<m; i++){
            temp[i] = a[i];
        }

        // Copy elements of b to temp
        for(int i=0; i<n; i++){
            temp[m+i] = b[i];
        }

        // Sort the temp array - same elements come together
        Arrays.sort(temp);

        for(int i=0; i<temp.length; i++){
            if(i == 0 || temp[i] != temp[i-1])
                System.out.println(temp[i]);
        }




    }


    



    public static void main(String args[]){

        int[] a={1,20,20,40,60};
        int[] b={2,20,20,20};
        unionNaive(a, b);
        //union(arr1, arr2);
        


    }
    
}
