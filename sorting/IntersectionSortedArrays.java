package sorting;

public class IntersectionSortedArrays {

    public static void intersectionNaive(int arr1[], int arr2[]){

        // Traverse through every element of arr1 from L --> R
        for(int i=0; i<arr1.length; i++){

            // To avoid duplicates
            if( i > 0 && arr1[i] == arr1[i-1])
                continue;

            // Traverse through every element of arr2 from L --> R
            for(int j=0; j<arr2.length; j++){

                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }

            }

        }



    }


    public static void intersection(int arr1[], int arr2[]){

        int i=0, j=0;

        while(i < arr1.length && j < arr2.length){

            // To handle duplicates
            if(i > 0 && arr1[i] == arr1[i-1])
                continue;

            // Three Cases
            if(arr1[i] < arr2[j]){
                i++;
            }

            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }

        }

    }


    public static void main(String args[]){

        int[] arr1={1,20,20,40,60};
        int[] arr2={2,20,20,20};
        //intersectionNaive(arr1, arr2);
        intersection(arr1, arr2);
        


    }
    
}
