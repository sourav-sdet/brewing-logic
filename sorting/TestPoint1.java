package sorting;

import java.util.Arrays;

public class TestPoint1 {


    public static void main(String args[]){

        // Array of Point Objects
        Point1 arr[] = { new Point1(10, 20), new Point1(3, 12), new Point1(5, 7)};

        // Custom Comparator
        Arrays.sort(arr, new MyCmp());

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i].x + " "+arr[i].y);
        }


    }
    
}
