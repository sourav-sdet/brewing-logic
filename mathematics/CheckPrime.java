package mathematics;

public class CheckPrime {

    public static boolean isPrimeNaive(int num){

        if(num == 1)
            return false;

        for(int i=2; i<num; i++){
            if(num % i == 0)
                return false;
        }

        return true;

    }


    public static boolean isPrime(int num){

        if(num == 1)
            return false;

        // Traverse from 2 to root num
        for(int i=2; i*i <= num; i++){
            if(num % i == 0)
                return false;
        }

        return true;

    }



    public static void main (String args[]){
        int num = 13;
        System.out.println(isPrime(num));

    }
    
}
