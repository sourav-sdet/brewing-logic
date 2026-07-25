package hashing;

public class PrintFrequencies {

    public static void printFrequenciesNaive(int arr[], int n){

        
        for(int i=0; i<n; i++){
          boolean flag = false;
          
          // Check if the element has already appeared before
          for(int j=0; j<i; j++){
            if(arr[i] == arr[j]){
                flag = true;
                break;
            }
          }

          // If element has has appeared before, continue
          if(flag == true)
            continue;

          // If element has not appeared before
          int freq = 0;
          for(int j=i; j<n; j++){
            if(arr[i] == arr[j])
                freq++;
          }

          System.out.println(arr[i] + " "+ freq);



        }

    }

    public static void main(String args[]){

        int[] arr={10,20,10,20,30};
        printFrequenciesNaive(arr, arr.length);
        


    }
    
}
