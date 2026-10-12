class Solution {
    public int findNumbers(int[] nums) {
       
        int ans=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int a=nums[i];
             int counter=0;
            while(a>0)
            {
                counter++;
                a/=10;
            }
            if(counter%2==0)
            {
                ans++;
            }
        }
        return ans;
    }
}