package arrays;

public class ArraysInsert {

    public static int insert(int arr[], int pos, int num, int capacity){

        // Check if array length = capacity
        if(arr.length == capacity)
            return arr.length;

        // Position starts from 1, Index starts from 0
        int index=pos-1;

        // If capacity is available, shift all array elements from index one place right
        for(int i=arr.length-1; i>=index; i--){
            arr[i+1] = arr[i];
        }

        arr[index] = num;
        return arr.length+1;
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
		
		
		int arraySize=insert(arr, 2, 10, arrayCapacity);
		System.out.println("New array size is: "+arraySize);
		
    }
    
}
