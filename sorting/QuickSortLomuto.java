package sorting;

public class QuickSortLomuto {


    public static void quickSortLomuto(int arr[], int l, int h){
        if(l < h){

            int p = LomutoPartition.lomutoPartition(arr, l, h);
            quickSortLomuto(arr, l, p-1);
            quickSortLomuto(arr, p+1, h);

        }
    }



    public static void main(String args[]){
        int[] a = {10,20,40,20,30};
        quickSortLomuto(a, 0, a.length-1);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
