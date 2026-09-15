package mathematics;

public class ComputingPower {

    public static int computePowerNaive(int x, int n){

        int res=1;

        for(int i=1; i<=n; i++){
            res = res * x;
        }

        return res;

    }




    public static void main(String args[]){

        System.out.println(computePowerNaive(2,3));


    }
    
}
