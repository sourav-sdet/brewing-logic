package arrays;

public class LeftRotateArray {


    public static void lRotateByOne(int arr[], int n){

        // Copy first element to a temp variable
        int temp=arr[0];

        // Shift all remaining elements one position left
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }

        // Copy temp element at last array position
        arr[n-1] = temp;

    }

    public static void lRotateByDNaive(int arr[], int n, int d){
         
        // Call lRotateByOne d times
        for(int i=0; i<d; i++){
            lRotateByOne(arr, n);
        }

    }


    public static void lRotateByDBetter(int arr[], int n, int d){
         
        // Copy first d elements of arr into a temp array
        int temp[] = new int[d];
        for(int i=0; i<d; i++){
            temp[i] = arr[i];
        }

        // Shift all remaining elements of arr d positions left
        for(int i=d; i<n; i++){
            arr[i-d] = arr[i];
        }

        // Copy d elements of temp array to last d positions of array
        for(int i=0; i<d; i++){
            arr[n-d+i] = temp[i];
        }

    }


    public static void lRotateByD(int arr[], int n, int d){

        // REVERSAL ALGORITHM

        //1- Reverse first d elements
        reverse(arr, 0,d-1);

        //2- Reverse elements from d to n-1
        reverse(arr, d, n-1);

        //3- Reverse whole array
        reverse(arr, 0, n-1);



    }

    public static void reverse(int arr[], int low, int high){

        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;
        }

    }


    public static void main(String args[]){

        int arr[] ={1,2,3,4,5,6,7};
        //int arr[] = {1,1,1};

		//lRotateByOne(arr, arr.length);
        //lRotateByDNaive(arr, arr.length, 3);
        //lRotateByDBetter(arr, arr.length, 3);
        lRotateByD(arr, arr.length, 2);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
		
    }


    
}
