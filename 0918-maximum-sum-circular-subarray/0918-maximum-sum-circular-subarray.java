class Solution {
    public int maxSubarraySumCircular(int[] nums) {
       int sum=0;
       int maxSum=nums[0];
       int minSum=nums[0];

       int currentMax=0;
       int currentMin=0;
       for(int i=0;i<nums.length;i++)
       {
        sum+=nums[i];
        currentMax=Math.max(nums[i],currentMax+nums[i]);
         maxSum=Math.max(maxSum,currentMax);
         currentMin=Math.min(nums[i],currentMin+nums[i]);
         minSum=Math.min(minSum,currentMin);
        
       }
       if(maxSum<0)
       {
        return maxSum;
       }
       return Math.max(maxSum,sum-minSum);
    }
}