package leetcode.hashMap;

import java.util.HashMap;

public class LC205_IsomorphicStrings {

    public static boolean isIsomorphic(String s, String t){

        // Two Strings are Isomorphic if characters in s can be replaced to get t

        // Check unequal length
        if(s.length() != t.length())
            return false;

        // Create a HashMap to store Character Mappings
        HashMap<Character, Character> hmap = new HashMap<>();

        // Iterate through s
        for(int i=0; i<s.length(); i++){

            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(hmap.containsKey(original) == false){

                if(hmap.containsValue(replacement) == false){
                    hmap.put(original, replacement);
                }
                else 
                    return false;
            }

            else {
                char mappedChar = hmap.get(original);
                if (mappedChar != replacement)
                    return false;
            }

        }

        return true;

    }





    public static void main(String args[]){
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }
    
}
