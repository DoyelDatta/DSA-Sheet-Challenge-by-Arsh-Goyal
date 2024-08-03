class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(min,nums[i]);
        }
        int a=0;
        for(int i=0;i<nums.length;i++)
        {
            a=a+nums[i]-min;
        }
        return a;
    }
}
