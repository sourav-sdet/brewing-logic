package searching;

public class SquareRoot {

    public static int squareRootFloorNaive(int x){

        int i=1;
        while(i * i <= x){
            i++;
        }

        return i-1;

    }






    public static void main(String args[]){

        int result = squareRootFloorNaive(15);
        System.out.println(result);

    }
    
}
