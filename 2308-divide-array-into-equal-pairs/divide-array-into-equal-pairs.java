import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        boolean flag=divideArray(nums);
        System.out.println(flag);
    }
    public static boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int a:nums){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(int key:map.keySet()){
            int v=map.get(key);
            if(v%2!=0){
                return false;
            }
        }
        return true;    
    }
}