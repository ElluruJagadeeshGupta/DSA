class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int sum=0;
        int minsum=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++)
        {
            sum=0;
            for(int j=i;j<nums.size();j++)
            {
                int length=j-i+1;
                sum+=nums.get(j);
                if(length>=l && length<=r)
                {
                  if(sum>0)
                  {
                   minsum=Math.min(sum,minsum);
                  }
                 

                }
            }
        }
        if(minsum!=Integer.MAX_VALUE)
        {
            return minsum;
        }
        else
        {
            return -1;
        }
    }
}