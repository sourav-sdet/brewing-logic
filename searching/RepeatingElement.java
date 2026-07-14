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

    public static int repeatingElementEfficient(int arr[], int n){

        boolean visited[] = new boolean[n];

        for(int i=0; i<n; i++){

            if(visited[arr[i]])
                return arr[i];
            visited[arr[i]] = true;

        }
        return -1;

    }
    

    public static int repeatingElement(int arr[], int n){

        // USING FAST AND SLOW POINTERS
        int slow = arr[0]+1, fast = arr[0]+1;

        // PHASE 1: Move slow one link at a time, move fast 2 links at a time
        do{
            slow = arr[slow]+1;
            fast = arr[arr[fast]+1]+1;
        }while(slow != fast);

        // PHASE 2: Move slow to the beginning, then move both slow and fast at the same pace
        // They will meet at the starting point of the cycle which is the repeating element
        slow = arr[0]+1;
        while(slow != fast){
            slow = arr[slow]+1;
            fast = arr[fast]+1;
        }
        return slow-1;


    }


    public static void main(String args[]){

        int arr[]={0,2,1,3,2,2};
        int result= repeatingElement(arr, arr.length);
        System.out.println(result);

    }
    
}
