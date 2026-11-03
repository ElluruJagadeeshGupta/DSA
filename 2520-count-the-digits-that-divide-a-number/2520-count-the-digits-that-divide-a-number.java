class Solution {
    public int countDigits(int num) {
        int counter=0;
        int real=num;
        while(num!=0)
        {
            int digit=num%10;
            num/=10;
            if(real%digit==0)
            {
                counter++;
            }
        }
        return counter;
    }
}