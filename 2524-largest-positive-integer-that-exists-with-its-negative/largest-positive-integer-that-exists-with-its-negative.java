import java.util.*;
public class Solution {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int N = sc.nextInt();
    //     int nums[]=new int[N];
    //     for(int i=0;i<N;i++){
    //         nums[i]=sc.nextInt();
    //     }
    //     int ans=findMaxK(nums);
    //     System.out.println(ans);
    // }
    public static int findMaxK(int[] nums) {
        Arrays.sort(nums);
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                int v=nums[i]*-1;
                if(set.contains(v)){
                    return v;
                }
            }
        }
        return -1;
    }
}