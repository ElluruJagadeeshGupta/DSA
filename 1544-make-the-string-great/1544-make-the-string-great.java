class Solution {
    public String makeGood(String s) {
        int i=1;
        while(i<s.length())
        {
            if(Math.abs(s.charAt(i)-s.charAt(i-1))==32)
            {
                s=s.substring(0,i-1)+s.substring(i+1);
                i=Math.max(1,i-1);
            }
            else
            {
                i++;
            }
        }
        return s;
    }
}