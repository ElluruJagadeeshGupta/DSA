class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {
        int xn;
        int yn;
        if(x1>xCenter)
        {
            xn=x1;
        }
        else if(x2<xCenter)
        {
            xn=x2;
        }
        else 
        {
            xn=xCenter;
        }

        if(y1>yCenter)
        {
            yn=y1;
        }
        else if(y2<yCenter)
        {
            yn=y2;
        }
        else {
            yn=yCenter;
        }




        if (((xn-xCenter)*(xn-xCenter))+((yn-yCenter)*(yn-yCenter))<=radius*radius)
        {
            return true;
        }
        return false;
    }

}