package strings;

public class LexicographicRank {

    // Assumption: All Characters of input string are DISTINCT
    public static int lexicographicRank(String str){
        int res = 1;
        int n= str.length();
        int mul = factorial(n);

        int count[] = new int[256];

        // STEP 1: Count frequency of every characters in the input string
        for(int i=0; i<n; i++){
            count[str.charAt(i)]++;
        }

        // STEP 2: Compute Cumulative Count of the count array
        // Cumulative Count at i means sum of all the counts from 0 to i-1
        for(int i=1; i<256; i++){
            count[i] = count[i] + count[i-1];
        }

        for(int i=0; i<n-1; i++){
            mul = mul / n-i;
            res = res + count[str.charAt(i) -1] * mul;
            for(int j= str.charAt(i); j < CHAR; j++)
                count[j]--;

        }


        return -1;
    }


    public static void main(String args[]){

        String str="string";
        System.out.println(lexicographicRank(str));


    }
    
}
