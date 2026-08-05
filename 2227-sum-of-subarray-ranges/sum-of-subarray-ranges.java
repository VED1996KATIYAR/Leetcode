import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums[]=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scan.nextInt();
        }
        long ans=subArrayRanges(nums);
        System.out.println(ans);
    }
    public static long subArrayRanges(int[] nums) {
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int min=nums[i];
            int max=nums[i];
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
                max=Math.max(max,nums[j]);
                sum+=(max-min);
            }
        }
        return sum;
    }
}