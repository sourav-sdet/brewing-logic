package arrays;

public class StockBuySell {


    public static int stockBuySell(int prices[], int n){

        int profit = 0;

        for(int i=1; i<n; i++){
            if(prices[i] > prices[i-1]){
                profit = profit + (prices[i] - prices[i-1]);
            }
        }

        return profit;
    }

    public static void main(String args[]){

        int arr[] ={1,5,3,8,12};
        
        //int result= maximumDifferenceNaive(arr, arr.length);
        int result= stockBuySell(arr, arr.length);
        System.out.println(result);
		
    }
    
}
