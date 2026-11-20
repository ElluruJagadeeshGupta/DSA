class Solution {
    public int countSubarrays(int[] nums) {
        int i=0;
        int j=2;
        int count=0;
        while(j<nums.length)
        {
         
            if(2*(nums[i]+nums[j])==nums[i+1])
            {
                count++;
            }
            i++;
            j++;
        }
              
            
        
        return count;
    }
}