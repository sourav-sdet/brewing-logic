package arrays;

public class FrequenciesSortedArray {


    public static void printFrequenciesSortedArray(int arr[], int n){

        int freq=1;  // Since first element is already processed
        int i=1; // Start iterating from the second element

        while(i < n){

            // Increment the frequency while current element is same as previous element
            while(i < n && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1] + " "+freq);
            i++;
            freq=1;

        }
        // Edge Case: When array contains only one element or last element is not same as second last element
        if(n == 1 || arr[n-1] != arr[n-2]){
            System.out.println(arr[i-1] + " "+1);
        }
    }
    
    public static void main(String args[]){

        int arr[] ={10,10,10,30,30,40};
        printFrequenciesSortedArray(arr, arr.length);
		
    }


    
}
