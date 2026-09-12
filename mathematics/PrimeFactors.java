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




    public static void main(String args[]){
        int num = 315;
        primeFactorsNaive(num);
    }
    
}
