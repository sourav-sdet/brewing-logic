package mathematics;

public class PrimeFactors {

    public static void primeFactorsNaive(int num){


        for(int i=2; i<num; i++){
            if(CheckPrime.isPrime(i)){

                int x=i;
                while(num % x == 0){
                    System.out.println(i);
                    x = x * i;
                }


            }
        }
        

    }

    // Efficient Solution Idea: Divisors of a number always exists in pairs
    public static void primeFactors(int num){

        if (num <=1)
            return;

        for(int i=2; i*i <= num; i++){
            while(num % i == 0){
                System.err.println(i);
                num = num / i;
            }
        }

        // When largest prime factor has power 1, falls into this case
        if(num > 1)
            System.out.println(num);

    }




    public static void main(String args[]){
        int num = 450;
        primeFactors(num);
    }
    
}
