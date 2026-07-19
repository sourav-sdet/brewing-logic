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


    public static int leftMostRepeatingCharacterBetter(String str){

        // String Character as indexes in a count array and store their frequencies
        int count[] = new int[256];

        for(int i=0; i< str.length(); i++){
            count[str.charAt(i)]++;
        }

        for(int i=0; i<str.length(); i++){
            if(count[str.charAt(i)] > 1)
                return i;
        }

        return -1;

    }

    public static void main(String args[]){

        String str = "abccbd";
        System.out.println(leftMostRepeatingCharacterBetter(str));
        	
    }
    
}
