package strings;

import java.util.Arrays;

public class AnagramCheck {

    static final int CHAR = 256;

    public static boolean areAnagramsNaive(String s1, String s2){

        if(s1.length() != s2.length())
            return false;
        
        char a1[] = s1.toCharArray();
        char a2[] = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);

    }


    public static boolean areAnagrams(String s1, String s2){

        if(s1.length() != s2.length())
            return false;

        int count[] = new int[CHAR];

        for(int i=0; i<s1.length(); i++){

            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;

        }

        for(int i=0; i<CHAR; i++){
            if(count[i] != 0)
                return false;
        }

        return true;


    }

    public static void main(String args[]){

        String s1 = "silent";
        String s2 = "listen";
        System.out.println(areAnagrams(s1,s2));
        	
    }
    
}
