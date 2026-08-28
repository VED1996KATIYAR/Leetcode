import java.util.*;
class Solution {
    public static int integerReplacement(int n) {
        return (int)help((long)n);
    }
    public static long help(long n) {
        if (n == 1) return 0;
        if(n%2==0){
            return help(n/2)+1;
        }else{
            return 1+Math.min(help(n-1), help(n+1));
        }
    }
}