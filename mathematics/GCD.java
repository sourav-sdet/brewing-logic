package mathematics;

public class GCD {

    public static int gcdNaive(int a, int b){

        int res = Math.min(a, b);
        
        while(res > 0){
            // Check if result divides both a and b
            if((a % res == 0) && (b % res == 0))
                break;
            res --;
            
        }

        return res;

    }



    public static void main(String args[]){

        int a=4, b=6;
        System.out.println(gcdNaive(a,b));


    }
    
}
