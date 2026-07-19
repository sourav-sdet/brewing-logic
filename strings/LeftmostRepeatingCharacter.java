package strings;

import java.util.Arrays;

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

    public static int leftMostRepeatingCharacterEfficientOne(String str){

        // Traverse the string from left to right
        // Keep track of index of first occurrence of every character
        int fIndex[] = new int[256];
        Arrays.fill(fIndex, -1);

        int res = Integer.MAX_VALUE;

        for(int i=0; i<str.length(); i++){

            int fi = fIndex[str.charAt(i)];

            if (fi == -1)
                fIndex[str.charAt(i)] = i;
            else 
                res = Math.min(res, fi);

        }

        return (res==Integer.MAX_VALUE)?-1:res;

    }

    public static int leftMostRepeatingCharacterEfficientTwo(String str){

        boolean visited[] = new boolean[256];
        int res=-1;

        // Traverse the array from RIGHT to LEFT
        for(int i=str.length() -1; i>=0; i--){

            // Check if the character is already visited
            if(visited[str.charAt(i)]){
                res = i;
            }
            else
                visited[str.charAt(i)] = true;
        }

        return res;


    }


    public static void main(String args[]){

        String str = "abccbd";
        System.out.println(leftMostRepeatingCharacterEfficientTwo(str));
        	
    }
    
}
