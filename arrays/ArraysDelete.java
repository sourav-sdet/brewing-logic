package arrays;

public class ArraysDelete {

    public static int delete(int arr[], int num){

        int n=arr.length;

        // Check if element x is available in the array
        int i;
        for(i=0; i<n; i++){
            if(arr[i] == num)
                break;
        }

        // If element is not found, return original size
        if(i == n)
            return n;

        // If element is found
        for(int j=i; j<n-1; j++ ){
            arr[j] = arr[j+1];
        }
        return n-1;        
    }


    public static void main(String args[]){

        int arrayCapacity=10;
		int arr[]=new int[arrayCapacity];
		arr[0]=5;
		arr[1]=7;
		arr[2]=2;
		arr[3]=8;
		arr[4]=1;
		arr[5]=0;
		
		
		int arraySize=delete(arr, 2);
		System.out.println("New array size is: "+arraySize);
		
    }
    
}
