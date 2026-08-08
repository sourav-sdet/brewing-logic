package sorting;

import java.util.Arrays;

public class ArraysSortingPrimitives {



    // In Java, Arrays.sort() is used to sort the arrays
    // 1- Arrays of Primitives (int, char etc), No Custom Comparator is allowed
    // 2- Arrays of Non Primitives (User Defined Class), Custom Comparator is allowed



    public static void main (String args[]){

        // Arrays.sort() for Arrays of primitives
        int arr1[] = {4,5,1,2,8,0};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));


        // Arrays.sort() to sort a sub array
        int arr2[] = {5,10,20,30,8};
        Arrays.sort(arr2,1,4);
        System.out.println(Arrays.toString(arr2));

    }



    
}
