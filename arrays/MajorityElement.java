package arrays;

public class MajorityElement {

    public static int findMajorityNaive(int arr[], int n){

        for(int i=0; i<n ; i++){

            int count=1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j])
                    count++;
            }

            if(count > (n/2))
                return i;

        }

        return -1;


    }



    public static int findMajority(int arr[], int n){
        // PHASE 1:
        // Initialise the first element index as majority and count =1
        int result=0,count=1;

        // Start iterating from the second element
        // For every element, check if it is same as the majority element
        // Same- count++, diff- count--
        // if count == 0, Reset count and majority
        for(int i=1; i<n; i++){
            if(arr[result] == arr[i])
                count++;
            else
                count--;
            if(count==0){
                result = i;
                count=1;
            }
        }
        
        // PHASE 2:
        // Count how many times arr[result] appears in the array
        count=0;
        for(int i=0; i<n; i++){
            if(arr[result] == arr[i]){
                count++;
            }
        }
        if(count <= (n/2))
            return -1;
        return result;


    }

    public static void main(String args[]){

        int arr[] ={8,7,6,8,6,6,6,6};
        
        int result= findMajority(arr, arr.length);
        System.out.println(arr[result]);
		
    }


    
}
