import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums[]= new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        int ans=longestConsecutive(nums);
        System.out.println(ans);
    }
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int val=0;
        for (int num : set) {
            if(!set.contains(num-1)) {
                int current=num;
                int curr=1;
                while (set.contains(current+1)) {
                    curr++;
                    current+=1;
                }
                val=Math.max(val,curr);
            }
        }
        return val;
    }
}