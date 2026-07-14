package searching;

public class MedianOfSortedArrays {

    public static double findMedian(int a1[], int n1, int a2[], int n2){

        // Beginning and Ending of first array a1 where binary search is performed
        int begin1=0, end1=n1-1;

        while (begin1 <= end1){

            int i1 = (begin1 + end1)/2;
            int i2 = ((n1 + n2 + 1)/2) - i1;

            int min1 = (i1 == n1) ? Integer.MAX_VALUE : a1[i1];
            int max1 = (i1 == 0)? Integer.MIN_VALUE : a1[i1-1];

            int min2 = (i2 == n2) ? Integer.MAX_VALUE : a2[i2];
            int max2 = (i2 == 0)? Integer.MIN_VALUE : a2[i2-1];


            if((max1 <= min2) && (max2 <= min1)){
                if((n1 + n2)%2 == 0)
                    return (double) (Math.max(max1, max2) + Math.min(max1, max2)) /2;
                else 
                    return (double) (Math.max(max1, max2));
            }
            else if(max1 > min2)
                end1 = i1-1;
            else 
                begin1 = i1 +1;


        }

        return -1;


    }


    public static void main(String args[]){

        int a1[] = {10,20,30,40,50};
        int a2[] = {5,15,25,35,45,55,65,75,85};
        double result = findMedian(a1, a1.length, a2, a2.length);
        System.out.println(result);
        
		
    }
    
}
