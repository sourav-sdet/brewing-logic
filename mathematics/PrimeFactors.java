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

    // More efficient implementation to save iterations
    public static void primeFactorsOptimized(int num){

        if (num <=1)
            return;

        while(num % 2 == 0){
            System.out.println(2);
            num = num/2;
        }

        while(num % 3 == 0){
            System.out.println(3);
            num = num/3;
        }

        for(int i=5; i*i <= num; i=i+6){
            while(num % i == 0){
                System.out.println(i);
                num = num / i;
            }

            while(num % (i+2) == 0){
                System.out.println(i+2);
                num = num / (i+2);
            }
        }

        // When largest prime factor has power 1, falls into this case
        if(num > 3)
            System.out.println(num);

    }




    public static void main(String args[]){
        int num = 450;
        primeFactorsOptimized(num);
    }
    
}
