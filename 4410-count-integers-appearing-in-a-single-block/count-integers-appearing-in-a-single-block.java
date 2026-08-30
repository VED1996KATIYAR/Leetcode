import java.util.*;

class Solution {
    public static int countSpecialIntegers(int[] nums) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            }else{
                int a=i;
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                map.put(nums[i],list);
            }
        }
        int res=0;
        for(int key:map.keySet()){
            int v=map.get(key).size();
            int start=map.get(key).get(0);
            int end=map.get(key).get(map.get(key).size()-1);
            int total=end-start+1;
            if(total==v){
                res++;
            }
        }
        return res;
    }
}