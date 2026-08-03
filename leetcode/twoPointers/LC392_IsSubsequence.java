package leetcode.twoPointers;

public class LC392_IsSubsequence {


    public static boolean isSubsequence(String s, String t){

        // If length of s is greater than t, s cannot be a subsequence of t
        if(s.length() > t.length())
            return false;


        // Check if s is a subsequence of t using TWO POINTER APPROACH
        int j=0;
        // Iterate through every characters of t from L --> R
        for(int i=0; i<t.length() && j<s.length(); i++){
            if(s.charAt(j) == t.charAt(i) )
                j++;

        }

        return (j==(s.length()));



    }


    public static void main(String args[]){
        String s="abc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    
}
