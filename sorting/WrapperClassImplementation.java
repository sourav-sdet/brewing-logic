package sorting;

import java.util.Arrays;
import java.util.Collections;

public class WrapperClassImplementation {

    public static void main(String args[]){

        // Wrapper Class Integer Array
        Integer arr1[] = {5, 20, 10,12};

        Arrays.sort(arr1, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr1));


        Integer arr2[] = {5,20,10,3,12};

        Arrays.sort(arr2, new EvenOddComparator());

        System.out.println(Arrays.toString(arr2));

    }
    
}
