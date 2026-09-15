package mathematics;

public class IterativePower {


    // Every number can be written as sum of powers of 2, (Set bits in Binary Representation)
    // We can travel through all bits of a number (LSB to MSB) in logn time

    // Logic is: Traverse through all the bits in binary representation of n from LSB to MSB
    // Multiply the number x with x when bit is set to 1

    public static int computePower(int x, int n){

        int res = 1;

        while(n > 0){
            if(n % 2 != 0)
                res = res * x;

            x = x * x;
            n = n/2;
        }

        return res;

    }

    public static void main(String args[]){

        System.out.println(computePower(4,5));


    }
    
}
