class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int maxW;
        int minW;
        maxW=Math.max(rec1[0],rec2[0]);
        minW=Math.min(rec1[2],rec2[2]);
        int commonWidth=minW-maxW;
        int maxH;
        int minH;
        maxH=Math.max(rec1[1],rec2[1]);
        minH=Math.min(rec1[3],rec2[3]);
        int commonHeight=minH-maxH;
        int commonArea=commonHeight*commonWidth;
        if(commonHeight>0 && commonWidth>0 )
        {
            return true;
        }
        return false;
    }
}