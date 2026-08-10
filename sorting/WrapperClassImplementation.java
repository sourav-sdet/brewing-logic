package sorting;

import java.util.Arrays;
import java.util.Collections;

public class WrapperClassImplementation {

    public static void main(String args[]){

        // Wrapper Class Integer Array
        Integer arr[] = {5, 20, 10,12};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println(Arrays.toString(arr));
    }
    
}
