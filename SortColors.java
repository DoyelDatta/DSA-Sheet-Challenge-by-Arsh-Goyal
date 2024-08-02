class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0) z++;
        else if(nums[i]==1) o++;
        else if(nums[i]==2) t++;
       }
       int a=0;
       for(int i=0;i<z;i++)
       {
        nums[a]=0;
        a++;
       }
       for(int i=0;i<o;i++)
       {
        nums[a]=1;
        a++;
       }
       for(int i=0;i<t;i++)
       {
        nums[a]=2;
        a++;
       }
       //return nums;
    }
}
