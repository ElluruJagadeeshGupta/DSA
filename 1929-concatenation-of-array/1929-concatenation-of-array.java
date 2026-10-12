class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i]=nums[i];
          
        }
       int[] sol=new int[nums.length+ans.length];
       for(int i=0;i<nums.length;i++)
       {
        sol[i]=nums[i];
       }
       for(int i=0;i<ans.length;i++)
       {
        sol[i+nums.length]=ans[i];
       }
       return sol;
       
    }
}