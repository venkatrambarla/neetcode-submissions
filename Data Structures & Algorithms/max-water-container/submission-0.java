class Solution {
    public int maxArea(int[] heights) {
        int area, maxArea=0;
        int left=0, right=heights.length-1;
        while(left<heights.length)
        {
  int height=Math.min(heights[left],heights[right]);
  int width=right-left;
   area=height*width;
   maxArea=Math.max(area, maxArea);
   if(heights[left]<=heights[right])
   {
    left++;
   }
   else
   {
    right--;
   }

        }
        return maxArea;
    }
}
