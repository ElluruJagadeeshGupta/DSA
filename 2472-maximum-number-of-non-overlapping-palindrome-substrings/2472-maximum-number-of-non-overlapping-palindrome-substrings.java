class Solution {
    public int maxPalindromes(String s, int k) {
        int n=s.length();
        int start=0;
        int answer=0;
        for(int right=k-1;right<n;right++)
        {
            for(int len=k;len<=right-start+1;len++)
            {
               
                    int left=right-len+1;
                    if(isPalindrome(s,left,right))
                    {
                        answer++;
                        start=right+1;
                        break;
                    }
                
            }
        }
        return answer;

    }
    private boolean isPalindrome(String s, int left , int right)
    {
        while(left<right)
        {
        if(s.charAt(left)!=s.charAt(right))
        {
            return false;
            
        }
           left++;
           right--;
        }
     
        return true;
        
    }
}