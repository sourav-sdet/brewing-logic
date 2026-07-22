package strings;

public class LexicographicRank {

    // Assumption: All Characters of input string are DISTINCT
    public static int lexicographicRank(String str){
        int res = 1;
        int n= str.length();
        int mul = factorial(n);

        int count[] = new int[256];

        // Count frequency of every characters in the input string
        for(int i=0; i<n; i++){
            count[str.charAt(i)]++;
        }

        // Compute Cumulative Count of the count array
        // Cumulative Count at i means sum of all the counts from 0 to i-1
        for(int i=1; i<256; i++){
            count[i] = count[i] + count[i-1];
        }

        for(int i=0; i<n-1; i++){
            mul = mul / n-i;
            res = res + count[str.charAt(i) -1] * mul;
            for(int j= str.charAt(i); j < 256; j++)
                count[j]--;

        }


        return res;
    }

    public static int factorial(int n){
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n-1);
    }


    public static void main(String args[]){

        String str="DCBA";
        System.out.println(lexicographicRank(str));


    }
    
}
