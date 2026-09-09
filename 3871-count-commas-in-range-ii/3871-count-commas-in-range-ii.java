class Solution {
    public long countCommas(long n) {
        long result = 0;

        if (n < 1000) {
            return 0;
        }

        
        if (n >= 1000) {
            long end = Math.min(n, 999999);
            result += end - 1000 + 1;
        }

      
        if (n >= 1000000) {
            long end = Math.min(n, 999999999);
            result += (end - 1000000 + 1) * 2;
        }

    
        if (n >= 1000000000L) {
            long end = Math.min(n, 999999999999L);
            result += (end - 1000000000L + 1) * 3;
        }
        if (n >= 1000000000000L) {
    long end = Math.min(n, 999999999999999L);
    result += (end - 1000000000000L + 1) * 4;
}
if (n >= 1000000000000000L) {
    long end = Math.min(n, 999999999999999999L);
    result += (end - 1000000000000000L + 1) * 5;
}
        return result;
    }
}