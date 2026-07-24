package hashing;

public class CountDistinctElements {

    public static int countDistinctNaive(int[] arr, int n){

        int res=0;
        for(int i=0; i<n; i++){
            boolean flag = false;

            // Check if the element has already appeared before
            for(int j=0; j<i; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }

            if(flag == false)
                res++;
        }
        return res;

    }


    public static void main(String args[]){

        int[] arr={10,20,10,20,30};
        int result = countDistinctNaive(arr, arr.length);
        System.out.println(result);


    }
    
}
