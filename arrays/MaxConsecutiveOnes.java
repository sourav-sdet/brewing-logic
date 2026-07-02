package arrays;

public class MaxConsecutiveOnes {

    public static int maxConsecutiveOnesNaive(int arr[], int n){

        int result=0;

        for(int i=0; i<n; i++){
            int curr=0;
            for(int j=i; j<n; j++){
                if(arr[j] == 1){
                    curr++;
                }else{
                    break;
                }
            }
            result=Math.max(result, curr);
        }

        return result;



    }


    public static int maxConsecutiveOnes(int arr[], int n){

        int result=0;
        int curr=0;

        for(int i=0; i<n; i++){
            if(arr[i] == 0)
                curr=0;
            else{
                curr++;
                result=Math.max(curr, result);
            }

        }

        return result;

    }


    public static void main(String args[]){

        int arr[] ={1,0,1,1,1,1,1,0,1,1};
        
        //int result= maxConsecutiveOnesNaive(arr, arr.length);
        int result= maxConsecutiveOnes(arr, arr.length);
        System.out.println(result);
		
    }
    
}
