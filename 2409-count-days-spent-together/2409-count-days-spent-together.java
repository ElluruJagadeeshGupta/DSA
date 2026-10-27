class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
       int[] months={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    int a1=convert(arriveAlice,months);
    int a2=convert(leaveAlice,months);
    int b1=convert(arriveBob,months);
    int b2=convert(leaveBob,months);

    int start=Math.max(a1,b1);
    int end=Math.min(a2,b2);
    if(start>end)
    {
        return 0;
    }
    return end-start+1;

    }
    public int convert(String date,int[] months)
    {
        String[] parts=date.split("-");
        int month=Integer.parseInt(parts[0]);
        int day=Integer.parseInt(parts[1]);

        int total=day;
        for(int i=0;i<month-1;i++)
        {
            total+=months[i];
        }

       return total;
    }
}