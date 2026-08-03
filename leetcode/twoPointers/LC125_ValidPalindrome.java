package leetcode.twoPointers;

public class LC125_ValidPalindrome {

    public static boolean isPalindrome(String s){

        // String s can contain alphanumeric and non alphanumeric characters
        // Needs to be checked for a palindrome after removing all non-alphanumeric characters

        String alphaNumericOnly = "";
        for(Character ch: s.toCharArray()){
            if(Character.isDigit(ch) || Character.isLetter(ch)){
                alphaNumericOnly += ch;
            }
        }

        alphaNumericOnly = alphaNumericOnly.toLowerCase();

        // Check Palindrome using two pointer approach
        int low = 0, high = alphaNumericOnly.length()-1;
        while(low < high){
            if(alphaNumericOnly.charAt(low) != alphaNumericOnly.charAt(high))
                return false;
            low ++;
            high --;
        }

        return true;

    }


    public static void main(String args[]){

        String s= "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));


    }



    
}
