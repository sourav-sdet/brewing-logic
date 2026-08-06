package leetcode.hashMap;

public class LC242_ValidAnagrams {

    public static boolean isAnagram(String s, String t){

        // Check unequal length
        if(s.length() != t.length())
            return false;

        // Since input strings contain lowercase characters only, initialize count array of size 26
        int count[] = new int[26];

        for(int i=0; i<s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++){
            count[t.charAt(i) - 'a']--;
        }

        for(int i=0; i<26; i++){
            if(count[i] != 0)
                return false;
        }

        return true;

    }




    public static void main(String args[]){
        String s="silent";
        String t="listen";
        System.out.println(isAnagram(s,t));
    }
    
}
