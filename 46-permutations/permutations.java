import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int nums[]=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=scan.nextInt();
        }
        List<List<Integer>> list=new ArrayList<>(permute(nums));
        System.out.println(list);
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        permutation(nums,0,list);
        return list;
    }
    public static void permutation(int[] nums,int start,List<List<Integer>> list){
        if(start==nums.length){
            List<Integer> list1=new ArrayList<>();
            for(int a:nums){
                list1.add(a);
            }
            list.add(new ArrayList<>(list1));
            return;
        }
        for(int i=start;i<nums.length;i++){
            int temp=nums[start];
            nums[start]=nums[i];
            nums[i]=temp;
            permutation(nums,start+1,list);
            temp=nums[start];
            nums[start]=nums[i];
            nums[i]=temp;
        }
    }
}