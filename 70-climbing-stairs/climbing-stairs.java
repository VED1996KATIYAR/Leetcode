class Solution {
    static int dp[];
    public int climbStairs(int n) {
        dp=new int[n+1];
        return ans(n);
    }
    public static int ans(int n){
        if(n==0 || n==1){return 1;}
        if(dp[n]!=0){
            return dp[n];
        }
        int answer=ans(n-1)+ans(n-2);
        dp[n]=answer;
        return answer;
    }
}
