package sorting;

public class QuickSortTailCallElimination {


    public static void quickSortTailCallElimination(int arr[], int l, int h){

        while(l < h){

            int p = LomutoPartition.lomutoPartition(arr, l, h);
            quickSortTailCallElimination(arr, l, p-1);
            
            // Tail Call Elimination
            l = p+1;

        }
    }



    public static void main(String args[]){
        int[] a = {10,20,40,20,30};
        quickSortTailCallElimination(a, 0, a.length-1);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }
    
}
