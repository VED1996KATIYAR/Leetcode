import java.util.*;
public class Solution {
    public static int missingMultiple(int[] nums, int k) {
        int l=Integer.MAX_VALUE/k;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);}
        for(int i=1;i<=l;i++){
            int v=i*k;
            if(!set.contains(v)){
                return v;
            }
        }
        return 0;
    }
}