package hashing;


import java.util.HashSet;

public class IntersectionUnsortedArrays {

    public static void intersectionNaive(int arr1[], int arr2[]){

        // Traverse through every element in arr1 from L-R
        for(int i=0; i< arr1.length; i++){
            boolean flag=false;

            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    flag = true;
                     break;
                }
            }
            if(flag == true){
                System.out.print(arr1[i]+" ");
            }


        }


    }


    public static void intersection(int arr1[], int arr2[]){
        HashSet<Integer> hset = new HashSet<>();

        // Traverse through elements of arr2 and put it into hashset
        for(int i=0; i<arr2.length; i++){
            hset.add(arr2[i]);
        }

        // Traverse through elements of arr1 and check if it is present in hashset, if present, print it.
        for(int i=0; i<arr1.length; i++){
            if(hset.contains(arr1[i]))
                System.out.print(arr1[i] + " ");
        }


    }



    public static void main(String args[]){

        int[] arr1={10,20,30};
        int[] arr2={10,30};
        //intersectionNaive(arr1, arr2);
        intersection(arr1, arr2);
        


    }



    
}
