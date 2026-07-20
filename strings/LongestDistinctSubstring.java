package strings;

import java.util.Arrays;

public class LongestDistinctSubstring {

    public static int longestDictinctNaive(String str){

        int res = 0;
        int n = str.length();

        // Consider every possible substrings of str, check if the substrings are distinct
        for(int i=0; i< n; i++){

            for(int j=i; j < n; j++){

                // For every substring starting with i and ending with j, check if they are distinct
                if(areDistinct(str, i, j)) 
                    res = Math.max(res, j-i+1);

            }

        }

        return res;


    }

    public static boolean areDistinct(String str, int i, int j){

        boolean visited[] = new boolean[256];

        for(int k=i; k <= j; k++){
            if(visited[str.charAt(k)] == true)
                return false;
            visited[str.charAt(k)] = true;
        }

        return true;


    }


    public static int longestDistinctBetter(String str){

        int res=0, n= str.length();

        for(int i=0; i<n; i++){
            // For every value of i, we have a visited array rather than a visited array for substring
            boolean visited[] = new boolean[256];
            for(int j=i; j<n; j++){
                if(visited[str.charAt(j)] == true)
                    break;
                else{
                    res = Math.max(res, j-i+1);
                    visited[str.charAt(j)] = true;
                }
            }

        }

        return res;


    }

    public static int longestDistinct(String str){
        int n=str.length(), result =0;

        // Create an initialize a previous array with -1
        int prev[] = new int[256];
        Arrays.fill(prev, -1);

        // Starting Index i
        int i=0;

        // Iterate from j=0 to n-1
        for(int j=0; j<n; j++){

            // To compute maxEnd, we need starting index i and ending index j
            i = Math.max(i, prev[str.charAt(j)]+1);


            // Compute maxEnd for every index j
            int maxEnd = j-i+1;

            // Find out the max of maxEnd- this is the result
            result = Math.max(maxEnd, result);

            prev[str.charAt(j)] = j;
        }

        return result;





    }



    public static void main(String args[]){

        String str = "abcadbd";
        System.out.println(longestDistinct(str));   
        	
    }
    
}
