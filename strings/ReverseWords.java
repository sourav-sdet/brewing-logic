package strings;

public class ReverseWords {

    public static String reverseWords(char ch[]){


        // REVERSAL ALGORITHM
        // Reverse Individual Words
        // Reverse Whole Array  

        //Initialize the start of current word as 0 and find the end of current word
        int start = 0;
        for(int end =0; end < ch.length; end ++){
            if(ch[end] == ' '){
                reverse(ch, start, end-1);
                start = end + 1;
            }
        }

        // Reverse the last word
        reverse(ch, start, ch.length-1);

        // Reverse the whole array
        reverse(ch, 0, ch.length-1);

        String result = new String(ch);
        return result;

    }

    public static void reverse(char[] ch, int start, int end){

        while(start <= end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;

            start ++;
            end --;
        }


    }

    public static void main(String args[]){

        String str = "Welcome to Gfg";
        System.out.println(str);
        System.out.println(reverseWords(str.toCharArray()));

        
        	
    }
    
}
