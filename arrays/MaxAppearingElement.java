package arrays;

public class MaxAppearingElement {

    public static int maxAppear(int left[], int right[], int n){

        int freq[] = new int[101];

        for(int i=0; i<n; i++){
            freq[left[i]]++;
            freq[right[i]+1]--;
        }

        int res=0;

        // Find the maximum value of freq array
        for(int i=1; i<100; i++){

            // Compute the prefix sum
            freq[i] = freq[i-1] + freq[i];
            if(freq[i] > freq[res]){
                res=i;
            }
        }
        return res;   

    }


    public static void main(String args[]){

        int left[]={1,2,4}, right[]={4,5,7};
        System.out.println(maxAppear(left,right,left.length));
		
    }




    
}
