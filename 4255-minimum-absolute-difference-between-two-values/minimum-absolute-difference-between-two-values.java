import  java.util.*;
class Solution {
    // public static void main(String[] args) {
    //     Scanner in = new Scanner(System.in);
    //     int n = in.nextInt();
    //     int nums[]=new int[n];
    //     for(int i=0;i<n;i++){
    //         nums[i]=in.nextInt();}
    //     int ans=minAbsoluteDifference(nums);
    //     System.out.println(ans);
    // }
    public static int minAbsoluteDifference(int[] nums) {
        int count=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                if(nums[i]==1 && nums[j]==2){
                    count=Math.min(count,Math.abs(i-j));
                }}
            }
        }
        return count==Integer.MAX_VALUE?-1:count;
    }
}