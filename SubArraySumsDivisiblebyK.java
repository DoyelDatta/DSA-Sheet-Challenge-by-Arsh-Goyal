class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int a[] =new int[k];
        int sum=0,c=0;
        a[0]=1;
        for(int i=0;i<nums.length;i++)
        {
            sum=sum+nums[i];
            int d=sum%k;
            if(d<0) d=d+k;
            c=c+a[d];
            a[d]++;
        }
        return c;
    }
}


