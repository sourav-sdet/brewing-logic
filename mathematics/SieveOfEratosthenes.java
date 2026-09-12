package mathematics;

import java.util.Arrays;

public class SieveOfEratosthenes {

    public static void primeNumbersSmallerOrEqualNaive(int num){


        for(int i=2; i<= num; i++){

            if(CheckPrime.isPrime(i))
                System.out.println(i);

        }

    }


    public static void primeNumbersSmallerOrEqual(int num){

        // SIEVE OF ERATOSTENES 
        // Create a boolean array of size n+1
        // Initially all elements in boolean array is marked as true
        // At the end of algorithm, composites will be marked as false
        // Primes will remain as true

        boolean isPrime[] = new boolean[num + 1];
        Arrays.fill(isPrime, true);


        for(int i=2; i*i <=num; i++){
            if(isPrime[i]){
                for(int j= 2*i; j<=num; j=j+i){
                    isPrime[j] = false;
                }
            }
        }

        for(int i=2; i<=num; i++){
            if(isPrime[i]){
                System.out.println(i);
            }
        }


    }


    public static void main(String args[]){
        int num = 23;
        primeNumbersSmallerOrEqual(num);
    }
    
}
