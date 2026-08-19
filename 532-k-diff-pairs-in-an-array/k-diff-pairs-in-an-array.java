import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=in.nextInt();
        }
        int k=in.nextInt();
        int ans=findPairs(nums,k);
        System.out.println(ans);
    }
    public static int findPairs(int[] nums, int k) {
        int count=0;
        HashSet<ArrayList<Integer>> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){

                    if(Math.abs(nums[i]-nums[j])==k){
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        Collections.sort(list);
                        set.add(new ArrayList<Integer>(list));
                    }

                }
            }
        }
        int ans=set.size();
        return ans;
    }
}