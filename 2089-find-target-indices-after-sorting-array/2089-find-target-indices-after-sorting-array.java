class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length-i-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int t=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=t;
                }
            }
        }
        List<Integer>result=new ArrayList();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
               result.add(i);
            }
        }
        return result;
    }
}