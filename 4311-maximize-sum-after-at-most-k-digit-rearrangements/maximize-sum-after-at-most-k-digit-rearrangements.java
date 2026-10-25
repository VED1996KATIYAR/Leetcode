import java.util.*;
class Solution {
    public static long maximizeSum(int[] nums, int k) {
        int[] gain=new int[nums.length];
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            String s=String.valueOf(nums[i]);
            char[] digits=s.toCharArray();
            Arrays.sort(digits);
            int ans=0;
            for (int i1 = digits.length-1; i1>=0; i1--) {
                ans=(ans*10)+digits[i1]-'0';
            }
            int differnce=ans-nums[i];
            gain[index++]=differnce;
        }
        long sum=0;
        for (int i=0;i<nums.length;i++) {
            sum+=nums[i];
        }
        Arrays.sort(gain);
        int last=gain.length-1;
        for (int j=1;j<=k;j++){
            sum+=gain[last];
            last--;
        }
        return sum;
    }
}