package searching;

public class IndexOfFirstOccurrenceSorted {

    public static int indexOfFirstOccurrence(int arr[],int n, int x){

        int low=0, high=n-1;

        while(low<=high){

            int mid = (low + high)/2;
            if(x > arr[mid])
                low = mid+1;
            else if(x < arr[mid])
                high = mid-1;

            else{
                // Check if its the first occurrence
                if(mid == 0 || (arr[mid] != arr[mid-1]))
                    return mid;
                else 
                    high = mid-1;
            }

        }

        return -1;

    }



    public static int indexOfLastOccurrence(int arr[],int n, int x){

        int low=0, high=n-1;

        while(low<=high){

            int mid = (low + high)/2;
            if(x > arr[mid])
                low = mid+1;
            else if(x < arr[mid])
                high = mid-1;

            else{
                // Check if its the last occurrence
                if(mid == n-1 || (arr[mid] != arr[mid+1]))
                    return mid;
                else 
                    low = mid+1;
            }

        }

        return -1;

    }


    public static void main(String args[]){

        int arr[] ={10,20,20,30,30,30,40,50,60};
        
        int indexFirst = indexOfFirstOccurrence(arr, arr.length,10);
        System.out.println(indexFirst);

        int indexLast = indexOfLastOccurrence(arr, arr.length,10);
        System.out.println(indexLast);
        
		
    }
    
}
