package strings;

public class PrintFrequenciesInSortedOrder {

    public static void printFrequenciesInSortedOrder(String str){

        // String contains only lowercase characters
        int count[] = new int[26];

        // Use String Characters as array indexes
        for(int i=0; i<str.length(); i++){

            count[str.charAt(i) - 'a']++;

        }

        for(int i=0; i<26; i++){
            if(count[i] > 0)
                System.out.println( (char)(i+'a') + " "+count[i]);
        }

    }

    public static void main(String args[]){

        String str = "geeksforgeeks";
        printFrequenciesInSortedOrder(str);
        	
    }
    
}
