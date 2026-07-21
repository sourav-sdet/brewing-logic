package strings;

import java.util.Arrays;

public class AnagramSearch {
    
    public static boolean anagramSearchNaive(String txt, String pat){

        int n= txt.length(), m= pat.length();

        for(int i=0; i<= n-m; i++){
            if(areAnagrams(txt, pat, i))
                return true;
        }

        return false;
    }

    public static boolean areAnagrams(String txt, String pat, int i){

        int count[] = new int[256];

        for(int j=0; j<pat.length(); j++){
            count[txt.charAt(i+j)]++;
            count[pat.charAt(j)]--;
        }

        for(int j=0; j<256; j++){
            if(count[j] !=0 )
                return false;
        }

        return true;

    }


    public static boolean anagramSearch(String txt, String pat){

        int ct[] = new int[256];
        int cp[] = new int[256];

        // Compute the count frequencies of first window of text and full pattern
        for(int i=0; i<pat.length(); i++){
            ct[txt.charAt(i)]++;
            cp[pat.charAt(i)]++;
        }

        // When we slide the pattern to next window of text, first check if ct and pt are same
        for(int i=pat.length(); i<txt.length(); i++){
            if(Arrays.equals(ct, cp))
                return true;

            // Add current window element
            ct[txt.charAt(i)]++;

            // Remove previous window element
            ct[txt.charAt(i - pat.length())]--;

        }

        return false;



    }




    public static void main(String args[]){

        String txt="geeksforgeeks";
        String pat="frog";
        System.out.println(anagramSearch(txt,pat));


    }
}
