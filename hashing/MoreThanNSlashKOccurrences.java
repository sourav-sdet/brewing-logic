package hashing;

import java.util.Arrays;

public class MoreThanNSlashKOccurrences {
    
    public static void moreThanNSlashKOccurrencesNaive(int arr[], int n, int k){

        // Sort the Array ==> All occurrences of every element come together
        Arrays.sort(arr);

        int i=1, count=1;
        while(i < n){
            while(i < n && arr[i] == arr[i-1]){
                count ++;
                i++;
            }

            if(count > n/k){
                System.out.println(arr[i-1] + " ");
            }

            count = 1;
            i++;
        }




    }




    public static void main(String args[]){

        int arr[] = {10,10,20,30,20,10,10};
        moreThanNSlashKOccurrencesNaive(arr, arr.length, 2);
    }
}
