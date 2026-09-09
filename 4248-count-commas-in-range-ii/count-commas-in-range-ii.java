class Solution {
    public long countCommas(long n) {
        long t = 0;
        
        
        for (long t1 = 1000; t1 <= n; t1 *= 1000) {
            t += (n - t1 + 1);
        }
        
        return t;
    }
}
