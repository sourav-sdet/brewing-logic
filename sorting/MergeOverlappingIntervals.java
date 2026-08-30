package sorting;

import java.util.Arrays;

public class MergeOverlappingIntervals {


    public static void mergeIntervals(Interval[] arr, int n){

        // Sort the Interval array in increasing order of start time
        Arrays.sort(arr);

        // Non Overlapping and Merged Intervals
        int res = 0;

        // Start iterating from the second element
        for(int i=1; i<n; i++){

            // Check if arr[i] overlaps with arr[i-1]
            // YES
            if( arr[i].start <= arr[res].end){

                arr[res].start = Math.min( arr[res].start, arr[i].start);
                arr[res].end = Math.max( arr[res].end, arr[i].end);

            }
            //NO
            else{
                res ++;
                arr[res] = arr[i];
            }
        }

        for(int i=0; i<=res; i++){

            System.out.println(arr[i].start + " "+ arr[i].end);
                
        }

    }







    public static void main(String args[]){

        Interval arr[] = { new Interval(5,10), new Interval(3,15), new Interval(18,30), new Interval(2,7)};
        mergeIntervals(arr, arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
    
}
