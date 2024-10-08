class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int e=nums1.length-1;
        while(n>0 && m>0)
        {
            if(nums2[n-1]>=nums1[m-1])
            {
                nums1[e]=nums2[n-1];
                n--;
            }
            else{
                nums1[e]=nums1[m-1];
                m--;
            }
            e--;
        }
        while(n>0)
        {
            nums1[e]=nums2[n-1];
            n--;
            e--;
        }
    }
}
