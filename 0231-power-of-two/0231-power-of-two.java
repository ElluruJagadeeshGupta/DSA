class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0)
        {
            return false;
        }
        else
        {
        long  num=1;
        while(num<n)
        {
            num*=2;
        }
        if(num==n)
        {
            return true;
        }
        }
        return false;
    }
}