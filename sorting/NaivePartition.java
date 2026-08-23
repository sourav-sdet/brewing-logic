package sorting;

public class NaivePartition {

    public static void naivePartition(int arr[], int l, int h, int p){

        // Create a temp array of size h-l+1
        int temp[] = new int[h-l+1];
        int index=0;

        // Copy all smaller and equal elements from arr to temp
        for(int i=l; i<=h; i++){
            if(arr[i] <= arr[p] && i!=p){
                temp[index] = arr[i];
                index++;
            }
        }
        temp[index++] = arr[p];

        // Copy all greater elements from arr to temp
        for(int i=l; i<=h; i++){
            if(arr[i] > arr[p]){
                temp[index] = arr[i];
                index++;
            }
        }

        // Copy temp elements to arr
        for(int i=l; i<=h; i++){
            arr[i] = temp[i-l];
        }


    }

    public static void main(String args[]){

        int arr[] = {5,13,6,9,12,11,8};
        naivePartition(arr, 0, 6, 6);
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}
