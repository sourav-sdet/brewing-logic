package strings;

public class PalindromeCheck {

    public static boolean isPalindromeNaive(String str){

        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return (str.equals(rev.toString()));

    }





    public static void main(String args[]){

        String str = "geeksforgeeks";
        System.out.println(isPalindromeNaive(str));
        	
    }
    
}
