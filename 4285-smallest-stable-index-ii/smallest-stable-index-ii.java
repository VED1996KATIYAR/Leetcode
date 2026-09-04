import java.util.*;
class Solution {
    public static int firstStableIndex(int[] nums, int k) {
        int min[]=new int[nums.length];
        int n=nums.length-1;
        int minimum=nums[n];
        for(int i=n;i>=0;i--){
            minimum=Math.min(minimum,nums[i]);
            min[i]=minimum;
        }
        int maximum=nums[0];
        for(int i=0;i<nums.length;i++){
            maximum=Math.max(maximum,nums[i]);
            if(maximum-min[i]<=k){
                return i;
            }
        }
        return -1;
    }
}