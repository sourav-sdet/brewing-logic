package arrays;

public class LargestElement {

    public static int largestElement(int arr[]){

        int n=arr.length;

        // Consider array as stream of data
        int largest=0;

        for(int i=1; i<n; i++){
            if(arr[i] > arr[largest])
                largest = i;
        }

        return largest;


    }


        public static void main(String args[]){

		int arr[]={5,7,2,8,10,0};

		int result=largestElement(arr);
		System.out.println("Largest element Index is: "+result);
		
    }
    
}
