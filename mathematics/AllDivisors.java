package mathematics;

public class AllDivisors {

    public static void allDivisorsNaive(int num){

        for(int i=1; i<=num; i++){
            if(num % i == 0)
                System.out.println(i);
        }

    }






    public static void main (String args[]){
        int num = 15;
        allDivisorsNaive(num);

    }
    
}
