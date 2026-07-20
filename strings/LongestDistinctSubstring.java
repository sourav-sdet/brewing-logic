package strings;

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

    public static void main(String args[]){

        String str = "abacde";
        System.out.println(longestDistinctBetter(str));   
        	
    }
    
}
