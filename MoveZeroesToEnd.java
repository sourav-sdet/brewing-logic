public class MoveZeroesToEnd {

    public static void moveZeroesToEnd(int arr[], int n){

        // Two Pointer Approach

        // Count of non zero elements
        int count=0; 

        for(int i=0; i<n; i++){
            if(arr[i] != 0){
                // Swap arr[i] and arr[count]
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;

                // Increment count of non zero elements
                count ++;
            }
        }



    }

    public static void main(String args[]){

        //int arr[] ={1,2,0,0,3,4,4,0,0,6,7,0};
        int arr[] = {1,1,1};

		moveZeroesToEnd(arr, arr.length);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
		
    }
    
}
