package mathematics;

public class CountOfTrailingZeroesInFactorial {

    public static int countTrailingZeroesNaive(int num){


        // Compute Factorial of num
        int fact = 1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }

        int count = 0;
        while(fact % 10 == 0){
            count ++;
            fact = fact / 10;
        }

        return count;


    }






    public static void main(String args[]){
        int num = 10;
        System.out.println(countTrailingZeroesNaive(num));
    }
    
}
