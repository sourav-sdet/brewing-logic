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


    public static void main(String args[]){

        int a=4, b=6;
        System.out.println(lcmNaive(a,b));


    }


    
}
