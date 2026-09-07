class Solution {
    public int distinctSubseqII(String s) {
        int MOD=1_000_000_007;
        int total=0;
        int[] end=new int[26];
        for(char c:s.toCharArray())
        {
            int index=c-'a';
            int oldTotal=total;
            int newSubsequences=(oldTotal+1-end[index]+MOD)%MOD;
            total=(total+newSubsequences)%MOD;
            end[index]=(end[index]+newSubsequences)%MOD;
        }
        return total;
    }
}