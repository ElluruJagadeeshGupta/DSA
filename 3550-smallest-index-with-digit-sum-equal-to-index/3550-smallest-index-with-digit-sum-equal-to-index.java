class Solution {
    public int smallestIndex(int[] nums) {
        int i=0;
        int sum=0;
        int r;
        while(i<nums.length)
        {
            int temp=nums[i];
            while(temp>0)
            {
                r=temp%10;
                sum+=r;
                temp/=10;
            }
            if(sum==i)
            {
                return i;
            }
            sum=0;
            i++;
        }
        return -1;
    }
}