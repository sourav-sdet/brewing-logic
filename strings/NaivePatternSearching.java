package strings;

public class NaivePatternSearching {

    public static void patternSearchNaive(String txt, String pat){

        int m=pat.length(), n=txt.length();

        for(int i=0; i<=n-m; i++){
            int j;
            for(j=0; j<m; j++){
                if(pat.charAt(j) != txt.charAt(i+j))
                    break;
            }
            if(j == m)
                    System.out.println(i+ " ");

        }

    }


    public static void patternSearchNaiveWithDistinctPattern(String txt, String pat){

        int m=pat.length(), n=txt.length();

        for(int i=0; i<=n-m;){
            int j;
            for(j=0; j<m; j++){
                if(pat.charAt(j) != txt.charAt(i+j))
                    break;
            }

            if(j == m) 
                System.out.println(i+" ");

            if(j==0)
                i++;
            else 
                i=i+j;
        }


    }

    public static void main(String args[]){

        String txt="ABCABCD";
        String pat="ABCD";
        patternSearchNaiveWithDistinctPattern(txt,pat);


    }
    
}
