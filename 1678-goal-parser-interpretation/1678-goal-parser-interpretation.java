class Solution {
    public String interpret(String c) {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<c.length();i++)
        {
            if(c.charAt(i)=='G')
            {
                ans.append('G');
            }
           else  if(c.charAt(i)=='(' && c.charAt(i+1)==')')
            {
                ans.append("o");
                i++;
            }
            else
            {
             ans.append("al");
             i=i+3;
            }
        }
        return ans.toString();
    }
}