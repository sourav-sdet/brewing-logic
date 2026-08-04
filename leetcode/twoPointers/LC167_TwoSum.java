package leetcode.twoPointers;

public class LC167_TwoSum {



    public static int[] twoSum(int []numbers, int target){

        // Array numbers is already sorted in non decreasing order
        // TWO POINTER APPROACH
        int result[] = new int[2];

        int low=0, high=numbers.length-1;

        while(low < high){
            if(numbers[low] + numbers[high] == target){
                result[0] = low +1;
                result[1] = high +1;
                return result;
            }
            else if(numbers[low] + numbers[high] < target){
                low ++;
            }
            else 
                high --;

        }

        return result;


    }



    public static void main(String args[]){
        int[] numbers = {2,7,11,15};
        int result[]=twoSum(numbers, 9);
        for(int i=0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
    
}
