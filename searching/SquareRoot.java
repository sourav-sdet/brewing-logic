package searching;

public class SquareRoot {

    public static int squareRootFloorNaive(int x){

        int i=1;
        while(i * i <= x){
            i++;
        }

        return i-1;

    }

    public static int squareRootFloor(int num){
        
        // Use Binary Search
        // We have a range from 1 to num
        int low=1, high=num;
        int result=-1;

        while(low <= high){

            int mid = (low + high)/2;
            int midSq= mid * mid;

            // Check if mid is a square root
            if(midSq == num)
                return mid;

            // If mid square is greater than num, go to left half
            else if(midSq > num)
                high = mid -1;

            // if mid square is smaller than num, store the result and go to the right half
            else{
                low = mid +1;
                result = mid;
            }

        }

        return result;
    }

    public static void main(String args[]){

        int result = squareRootFloor(25);
        System.out.println(result);

    }
    
}
