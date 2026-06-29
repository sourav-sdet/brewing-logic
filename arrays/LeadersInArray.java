package arrays;

public class LeadersInArray {

    public static void printLeadersNaive(int arr[], int n){

        
        for(int i=0; i<n; i++){
            boolean flag=false;
            for(int j=i+1; j<n; j++){
                if(arr[j] >= arr[i]){
                    flag = true;
                    break;
                }
            }
            if(flag == false)
                System.out.println(arr[i]);
        }


    }
    

    public static void printLeaders(int arr[], int n){

        int curr_ldr = arr[n-1];
        System.out.println(curr_ldr);

        for(int i=n-2; i>=0; i--){

            // Check if current element a[i] > current leader
            if(arr[i] > curr_ldr){
                curr_ldr = arr[i];
                System.out.println(curr_ldr);
            }

        }

    }







    public static void main(String args[]){

        int arr[] ={7,10,4,10,6,5,2};
        //printLeadersNaive(arr, arr.length);
        printLeaders(arr, arr.length);
		
    }
}
