package leetcode.twoPointers;



public class LC11_ContainerWithMostWater {

    public static int maxArea(int[] heights){

        int max=0, n=heights.length;

        // TWO POINTER APPROACH
        int left = 0, right = n-1;

        while(left < right){

            // Compute the area
            int area = Math.min(heights[left], heights[right]) * (right - left);
            max = Math.max(max, area);

            if(heights[left] < heights[right])
                left ++;
            else 
                right --;
 
        }


        return max;

    }



    public static void main(String args[]){
        int[] heights = {1,8,6,2,5,4,8,3,7};
        int result=maxArea(heights);
        System.out.println(result);

    }
    
}
