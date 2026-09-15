package mathematics;

public class ComputingPower {

    public static int computePowerNaive(int x, int n){

        int res=1;

        for(int i=1; i<=n; i++){
            res = res * x;
        }

        return res;

    }


    public static int computePower(int x, int n){

        if (n == 0)
            return 1;

        int temp = computePower(x, n/2);
        temp = temp * temp;

        if(n %2 ==0)
            return temp;
        else 
            return temp * x;

    }




    public static void main(String args[]){

        System.out.println(computePower(2,3));


    }
    
}
