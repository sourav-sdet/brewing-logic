package mathematics;

public class Factorial {


    public static int factorialIterative(int num){

        if(num == 0)
            return 1;

        int fact=1;
        for(int i=1; i<=num; i++){
            fact = fact * i;
        }

        return fact;


    }

    public static int factorialRecursive(int num){

        // Base Case
        if(num == 0 )
            return 1;

        else 
            return num * factorialRecursive(num - 1);


    }



    public static void main(String args[]){
        int num = 5;
        System.out.println(factorialRecursive(num));
    }
    
}
