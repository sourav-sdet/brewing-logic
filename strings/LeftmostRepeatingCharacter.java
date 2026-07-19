package strings;

public class LeftmostRepeatingCharacter {

    public static int leftMostRepeatingCharacterNaive(String str){

        // Traverse through every character
        // For every character check if it repeats
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length(); j++){
                if(str.charAt(i) == str.charAt(j))
                    return i;
            }

        }
        return -1;

    }

    public static void main(String args[]){

        String str = "geeksforgeeks";
        System.out.println(leftMostRepeatingCharacterNaive(str));
        	
    }
    
}
