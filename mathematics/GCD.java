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

    public static int gcdEuclideanBasic(int a, int b){

        while(a != b){

            if(a > b)
                a = a-b;
            else 
                b= b-a;
        }

        return a;

    }


    public static int gcdEuclideanOptimized(int a, int b){

        if (b == 0)
            return a;

        else
            return gcdEuclideanOptimized(b, a % b);

    }

    public static void main(String args[]){

        int a=4, b=6;
        System.out.println(gcdEuclideanOptimized(a,b));


    }
    
}
