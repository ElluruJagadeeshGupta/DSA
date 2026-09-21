class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] original=new int[nums.length];
        for(int i=0;i<original.length;i++)
        {
            original[i]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        int[] ans=new int[nums.length];
        int[] count=new int[nums.length];
        for(int i=1;i<nums.length;i++)
        {
              if(nums[i]>nums[i-1])
              {
               count[i]=i;
              }
              else if(nums[i]==nums[i-1])
              {
                count[i]=count[i-1];
              }
        }
        for(int i=0;i<original.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(original[i]==nums[j])
                {
                    ans[i]=count[j];
                }
            }
        }      
        return ans;
    }
}