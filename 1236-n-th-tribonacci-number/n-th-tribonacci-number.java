class Solution {
    static int dp[];
    public int tribonacci(int n) {
        dp=new int[n+1];
        return ans(n);
    }
    public static int ans(int n){
        if(n==0){return 0;}
        if(n==1){return 1;}
        if(n==2){return 1;}
        if(dp[n]!=0){
            return dp[n];
        }
        int answer=ans(n-3)+ans(n-2)+ans(n-1);
        dp[n]=answer;
        return answer;
    }
}