package hashing;

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






    public static void main(String args[]){

        int[] arr1={10,20,30};
        int[] arr2={10,30};
        intersectionNaive(arr1, arr2);
        


    }



    
}
