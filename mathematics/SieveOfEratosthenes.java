package mathematics;

public class SieveOfEratosthenes {

    public static void primeNumbersSmallerOrEqualNaive(int num){


        for(int i=2; i<= num; i++){

            if(CheckPrime.isPrime(i))
                System.out.println(i);

        }

    }

    public static void main(String args[]){
        int num = 23;
        primeNumbersSmallerOrEqualNaive(num);
    }
    
}
