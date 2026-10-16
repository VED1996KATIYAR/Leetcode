import java.util.*;
class Solution {
    public static int trap(int[] height) {
        int max=height[0];
        int n=height.length;
        int left[]=new int[n];
        left[0]=height[0];
        for (int i=1;i<n;i++){
            left[i]=Math.max(max,height[i]);
            max=Math.max(height[i],max);
        }
        int right[]=new int[n];
        right[n-1]=height[n-1];
        int max1=right[n-1];
        for (int i=n-2;i>=0;i--){
            right[i]=Math.max(height[i],max1);
            max1=Math.max(height[i],max1);
        }
        int ans[]=new int[height.length];
        for (int i=0;i<height.length;i++){
            ans[i]=Math.min(left[i],right[i])-height[i];
        }
        int sum=0;
        for(int a:ans){
            sum+=a;
        }
        return sum;
    }
}