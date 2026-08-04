import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int nums[]=new int[n];
        for (int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        List<Integer> list=new ArrayList<>(findMissingElements(nums));
        System.out.println(list);
    }
    public static List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int a:nums){
            set.add(a);
        }
        for(int i=nums[0];i<=nums[nums.length-1];i++){
            if(!set.contains(i)){
                list.add(i);
            }
        }
        return list;
        
    }
}