package leetcode.hashMap;

public class LC383_RansomNote {

    public static boolean canConstruct(String ransomNote, String magazine){

        // ransomNote and magazine consist of lower case english characters

        int count[] = new int[26];

        // Traverse through string magazine, increment count in count array
        for(int i=0; i<magazine.length(); i++){
            count[magazine.charAt(i) - 'a']++;
        }

        // Traverse through string ransomNote, decrement count in count array
        for(int i=0; i<ransomNote.length(); i++){
            count[ransomNote.charAt(i) - 'a']--;
        }

        // Traverse through count array and check if count[i] < 0
        for(int i=0; i<26; i++){
            if(count[i] < 0)
                return false;
        }
        return true;

    }


    public static void main(String args[]){
        String ransomNote = "a";
        String magazine = "b";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    
}
