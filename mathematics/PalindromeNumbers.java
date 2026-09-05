package mathematics;

public class PalindromeNumbers {


    public static boolean isPalindrome(int num){

        int rev = 0, x = num;

        while(num > 0){

            rev = rev*10 + num % 10;
            num = num/10;

        }

        return (x == rev);

    }


    public static void main(String args[]){
        int num = 789871;
        System.out.println(isPalindrome(num));
    }
    
}
