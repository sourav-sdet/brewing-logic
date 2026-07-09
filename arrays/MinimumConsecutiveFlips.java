package arrays;

public class MinimumConsecutiveFlips {


    public static void printGroups(int arr[], int n){

        for(int i=1; i<n; i++){

            // Check if it is same as the previous element
            // If same, don't do anything
            if(arr[i] != arr[i-1]){  // If not same, this marks the beginning of a new group
                
                if(arr[i] != arr[0]) // If its not equal to the first element, it marks the beginning of second group
                    System.out.print("From "+i+" ");
                else  // if it is equal to the first element, it marks the ending of second group
                    System.out.println("To "+(i-1));
            }

        }

        // If last element is different then first element
        if(arr[n-1] != arr[0])
            System.out.println("To "+(n-1));


    }


    public static void main(String args[]){

        int arr[] ={0,0,1,1,0,0,1,1,0};
        printGroups(arr, arr.length);
        
		
    }
    
}
