class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i=0;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        for(int j=0;j<nums.length;j++)
        {
            sum+=nums[j];
            while(sum>=target)
            {
                int length=j-i+1;
                 minLength=Math.min(minLength,length);
                 sum-=nums[i];
                 i++;
            }
        }
        return minLength==Integer.MAX_VALUE ? 0: minLength;
    }
}