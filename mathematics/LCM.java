package mathematics;

public class LCM {

    public static int lcmNaive(int a, int b){

        int res = Math.max(a, b);

        while(true){

            if(res % a == 0 && res % b == 0)
                break;
            res ++;

        }

        return res;

    }

    public static int lcmEfficient(int a, int b){

        // Use Euclidean Algorithm to find gcd(a,b)
        int gcd = GCD.gcdEuclideanOptimized(a,b);

        return (a*b)/gcd;



    }


    public static void main(String args[]){

        int a=4, b=6;
        System.out.println(lcmEfficient(a,b));


    }


    
}
