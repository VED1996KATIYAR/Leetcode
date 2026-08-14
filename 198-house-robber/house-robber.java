import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        int ans=rob(nums);
        System.out.println(ans);
    }
    public static int rob(int[] nums) {
        if(nums.length==0 || nums==null){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
        int dp[]=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}