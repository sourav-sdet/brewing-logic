package sorting;

public class MergeFunction {

    public static void merge(int a[], int low, int mid, int high){

        // SETTING UP AUXILARY ARRAY
        // Create two auxilary arrays left and right
        // left stores from low to mid
        // right stores from mid+1 to high
        int n1 = mid - low +1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];

        // COPY ELEMENTS FROM INPUT ARRAY TO LEFT (LOW TO MID)
        for(int i=0; i<n1; i++){
            left[i] = a[low + i];
        }

        // COPY ELEMENTS FROM INPUT ARRAY TO RIGHT (MID +1 TO HIGH)
        for(int i=0; i<n2; i++){
            right[i] = a[mid + 1 + i];
        }

        








    }





    public static void main(String args[]){

        int[] a = {10,20,40,20,30};
        merge(a, 0, 0, a.length);

    }
    
}
