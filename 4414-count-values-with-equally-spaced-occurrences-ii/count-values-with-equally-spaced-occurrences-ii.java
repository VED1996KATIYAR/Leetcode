import java.util.*;

class Solution {
    public static int countSpecialIntegers(int[] nums) {
        int count = 0;
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.get(nums[i]).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(nums[i], list);
            }
        }
        for (int arr : map.keySet()) {
            ArrayList<Integer> list = map.get(arr);
            if(list.size()<3){
                continue; 
            }
            boolean check = true;
            int ans = list.get(1) - list.get(0);
            for (int i = 2; i < list.size(); i++) {
                if (((list.get(i) - list.get(i - 1)) != ans)) {
                    check = false;
                    break;
                }
            }
            
            if (check) {
                count++;
            }
        }
        return count;
    }
}