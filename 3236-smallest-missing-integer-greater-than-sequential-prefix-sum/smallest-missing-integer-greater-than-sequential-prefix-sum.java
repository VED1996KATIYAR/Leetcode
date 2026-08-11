import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int ams=missingInteger(nums);
        System.out.println(ams);
    }
    public static int missingInteger(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        int ans=nums[0];
        int i=1;
        while(i<nums.length){
            if(nums[i]==nums[i-1]+1){
                ans+=nums[i];
                i++;
            }else {
                break;
            }
        }
        while (true){
            if(!set.contains(ans)){
                return ans;
            }else{
                ans++;
            }
        }

    }
}