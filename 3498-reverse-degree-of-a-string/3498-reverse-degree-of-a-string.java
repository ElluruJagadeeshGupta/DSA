class Solution {
    public int reverseDegree(String s) {
       int sum=0;
       for(int i=0;i<s.length();i++)
       {
        char ch=s.charAt(i);
        int alphabet=ch-'a'+1;
        int reverse=27-alphabet;
        int pos=i+1;
        int product=reverse*pos;
        sum+=product;
       } 
       return sum;
    }
}