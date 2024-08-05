class Solution {
    public int maxArea(int[] height) {
       int left=0,max=0;
       int right=height.length-1;
       while(left<right)
       {
        int area=Math.min(height[left],height[right])*(right-left);
        max=Math.max(area,max);
        if(height[left]>height[right])
        {
            right--;
        }
        else if(height[left]<=height[right])
        {
            left++;
        }
       }
       return max;
    }
}
