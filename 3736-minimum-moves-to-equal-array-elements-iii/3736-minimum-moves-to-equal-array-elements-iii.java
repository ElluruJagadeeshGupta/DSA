class Solution {
    public int minMoves(int[] nums) {
        int counter=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                max=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            while(nums[i]!=max)
            {
                int moves=max-nums[i];
                nums[i]+=moves;
                counter+=moves;
            }
        }
        return counter;
    }
}