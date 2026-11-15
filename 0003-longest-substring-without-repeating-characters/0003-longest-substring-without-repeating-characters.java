class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> charset=new HashSet<>();
        int max_length=0;
        int left=0;
        for(int right=0;right<s.length();right++)
        {
            while(charset.contains(s.charAt(right)))
            {
                charset.remove(s.charAt(left));
                left++;
            }
            charset.add(s.charAt(right));
            max_length=Math.max(max_length,right-left+1);
        }
        return max_length;
    }
}