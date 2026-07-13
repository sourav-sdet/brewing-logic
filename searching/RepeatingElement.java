package searching;

import java.util.Arrays;

public class RepeatingElement {

    public static int repeatingElementSuperNaive(int arr[], int n){

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j])
                    return arr[i];
            }

        }
        return -1;

    }

    public static int repeatingElementNaive(int arr[], int n){
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++){
            // For every element, check if it is same as the next element
            if(arr[i] == arr[i+1])
                return arr[i];    
        
        }
        return -1;

    }




    public static void main(String args[]){

        int arr[]={0,2,1,3,2,2};
        int result= repeatingElementNaive(arr, arr.length);
        System.out.println(result);

    }
    
}
