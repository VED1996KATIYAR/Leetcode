import java.util.*;
public class Solution {
    public static long maxAlternatingSum(int[] nums) {
        long square[]=new long[nums.length];
        int k= nums.length;
        for (int i = 0; i<k; i++) {
            square[i]= (long) nums[i] *nums[i];
        }
        Arrays.sort(square);
        long sum=0;
        for(int i=0;i<k/2;i++){
            sum-=square[i];
        }
        for (int j=k/2;j<k;j++){
            sum+=square[j];
        }
        return sum;
    }
}