package sorting;

import java.util.Arrays;

public class UnionSortedArrays {

    public static void unionNaive(int a[], int b[]){

        int m=a.length;
        int n=b.length;

        // Use Sorting
        int[] temp = new int[m+n];

        // Copy elements of a to temp
        for(int i=0; i<m; i++){
            temp[i] = a[i];
        }

        // Copy elements of b to temp
        for(int i=0; i<n; i++){
            temp[m+i] = b[i];
        }

        // Sort the temp array - same elements come together
        Arrays.sort(temp);

        for(int i=0; i<temp.length; i++){
            if(i == 0 || temp[i] != temp[i-1])
                System.out.println(temp[i]);
        }




    }


    public static void union(int a[], int b[]){

        int i=0, j=0;
        
        while(i < a.length && j < b.length){

            // To handle duplicates in a
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
                

            // To handle duplicates in b
            if(j > 0 && b[j] == b[j-1]){
                j++;
                continue;
            }
                
            
            // Three Cases
            if(a[i] < b[j]){
                System.out.println(a[i]);
                i++;
            }
            else if(a[i] > b[j]){
                System.out.println(b[j]);
                j++;
            }
            else{
                System.out.println(a[i]);
                i++; j++;
            }

        }


        // Reach end of array b, so process remaining a
        while(i < a.length){
            if(i > 0 && a[i]!= a[i-1]){
                System.out.println(a[i]);
                i++;
            }
                    
         }

        // Reach end of  array a, so process remaining b
        while (j < b.length){
            if(j > 0 && b[j] != b[j-1]){
                System.out.println(b[j]);
                j++;
            }
                    
        }


    }



    public static void main(String args[]){

        int[] a={1,20,20,40,60};
        int[] b={2,20,20,20};
        //unionNaive(a, b);
        union(a, b);
        


    }
    
}
