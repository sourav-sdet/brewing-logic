package strings;

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







    public static void main(String args[]){

        String txt="geeksforgeeks";
        String pat="frog";
        System.out.println(anagramSearchNaive(txt,pat));


    }
}
