class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int l=nums.length;
        for(int i=0;i<l;i++)
        {
            if(!set.add(nums[i]))
            return nums[i];
        }
        return l;
    }
}
