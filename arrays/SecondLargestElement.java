package arrays;

public class SecondLargestElement {

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

    public static int secondLargestNaive(int arr[]){
        int n = arr.length;

        // Find the index of largest element
        int largest = largestElement(arr);

        // Find the largest among remaining elements
        int secondLargest=-1;
        for(int i=0; i<n; i++){
            // Consider elements which are not equal to largest
            if(arr[i] != arr[largest]){
                if(secondLargest == -1){
                    secondLargest=i;
                }
                else if(arr[i] > secondLargest){
                    secondLargest=i;
                }
            }
        }

        return secondLargest;

    }

    public static int secondLargest(int arr[]){
        int n=arr.length;
        int largest=0, secondLargest=-1;

        // Consider array as a stream of data
        for(int i=1; i<n; i++){

            // For new element, there are 3 possible cases
            //1- newElement > largest
            if(arr[i] > arr[largest]){
                secondLargest = largest;
                largest=i;
            }
            // if newElement == largest, then ignore

            // if newElement < largest
            else if(arr[i] != arr[largest]){
                // if secondLargest == -1 or newElement > secondLargest
                if(secondLargest == -1 || arr[i] > arr[secondLargest])
                    secondLargest = i;

            }


        }

        return secondLargest;
    }

     public static void main(String args[]){

		int arr[]={5,7,2,8,10,9};

		int result=secondLargest(arr);
		System.out.println("Second Largest element Index is: "+result);
		
    }

    
}
