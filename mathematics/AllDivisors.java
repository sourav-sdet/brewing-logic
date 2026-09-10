package mathematics;

public class AllDivisors {

    public static void allDivisorsNaive(int num){

        for(int i=1; i<=num; i++){
            if(num % i == 0)
                System.out.println(i);
        }

    }


    public static void allDivisorsNotInSortedOrder(int num){


        for(int i=1; i*i <= num; i++){
            if(num % i == 0){
                System.err.println(i);
                if(i != num/i)
                    System.err.println(num/i);
            }
        }


    }






    public static void main (String args[]){
        int num = 25;
        allDivisorsNotInSortedOrder(num);

    }
    
}
