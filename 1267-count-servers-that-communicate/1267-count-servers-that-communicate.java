class Solution {
    public int countServers(int[][] grid) {
        int count=0;
        int rows=grid.length;
        int cols=grid[0].length;

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(grid[i][j]==1)
                {
                    boolean row=false;
                    boolean col=false;

                    for(int k=0;k<cols;k++)
                    {
                        if(k!=j && grid[i][k]==1)
                        {
                            row=true;
                        }
                        
                    }
                    for(int k=0;k<rows;k++)
                    {
                        if(k!=i && grid[k][j]==1)
                        {
                            col=true;
                        }
                    }
                    if(row || col)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}