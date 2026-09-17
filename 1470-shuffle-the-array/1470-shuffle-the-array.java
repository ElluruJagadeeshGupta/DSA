class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] answer=new int[nums.length];
        int index=0;
        for(int i=0;i<n;i++)
        {
            answer[index++]=nums[i];
            answer[index++]=nums[i+n];
        }
        return answer;

    }
}