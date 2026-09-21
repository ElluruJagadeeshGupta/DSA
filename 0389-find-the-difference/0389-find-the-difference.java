class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        for(int i=0;i<s.length();i++)
        {
              sum1=sum1+(s.charAt(i)-'a');
        }
        int sum2=0;
        for(int j=0;j<t.length();j++)
        {
            sum2=sum2+(t.charAt(j)-'a');
        }
        int total=sum2-sum1;
        char ch=(char)('a'+total);
        return ch;
    }
}