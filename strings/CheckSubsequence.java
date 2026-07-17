package strings;

public class CheckSubsequence {

    public static boolean isSubsequence(String s1, String s2){

        int n1=s1.length(), n2=s2.length();
        
        if(n1 < n2)
            return false;

        int j=0;
        for(int i=0; i<n1 && j<n2; i++){

            if(s1.charAt(i) == s2.charAt(j))
                j++;

        }

        return j==n2;


    }




    public static void main(String args[]){

        String s1 = "geeksforgeeks";
        String s2 = "grges";
        System.out.println(isSubsequence(s1,s2));
        	
    }
    
}
