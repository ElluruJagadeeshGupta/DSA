class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] left=new int[nums.length];
      int[] right=new int[nums.length];
      
      
      for(int i=1;i<left.length;i++)
      {
        left[0]=1;
        left[i]=nums[i-1]*left[i-1];
      }
      for(int j=right.length-2;j>=0;j--)
      {
        right[nums.length-1]=1;
        right[j]=right[j+1]*nums[j+1];
      }
      int[] ans=new int[nums.length];
      for(int k=0;k<ans.length;k++)
      {
        ans[k]=left[k]*right[k];
      }
      return ans;
    }
}