class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        int minNeed=Math.min(need1,need2);
        int maxNeed=Math.max(need1,need2);
        long remainingCost=0;
        if(need1>need2)
        {
            remainingCost=(long)(need1-need2)*cost1;
        }
        else
        {
             remainingCost=(long)(need2-need1)*cost2;
        }
        long totalCost1=(long)minNeed*costBoth+remainingCost;
       long totalCost2=(long)cost1*need1+(long)cost2*need2;
       long totalCost3=(long)maxNeed*costBoth;

       return Math.min(totalCost2,Math.min(totalCost1,totalCost3));
    }
}