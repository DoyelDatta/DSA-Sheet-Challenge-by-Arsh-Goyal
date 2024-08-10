class Solution {
    public int reversePairs(int[] nums) {
        return mergesort(nums,0,nums.length-1);
    }
    private int mergesort(int[] nums,int start, int end)
    {
        if(start>=end) return 0;
        int mid=start+(end-start)/2;
        int c=mergesort(nums,start,mid)+mergesort(nums,mid+1,end);
        for(int i=start,j=mid+1;i<=mid;i++)
        {
            while(j<=end && nums[i]/2.0>nums[j]){
            j++;}
            c=c+j-(mid+1);
        } 
    Arrays.sort(nums,start,end+1);
    return c;
    }   
}
