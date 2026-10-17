class Solution {
    public int subtractProductAndSum(int n) {
        int sum1=0;
        int sum2=1;
      while(n>0)
      {
        int r;
        r=n%10;
        sum1+=r;
        n=n/10;
        sum2*=r;
      } 
    return sum2-sum1;
    }
}