import java.util.*;
public class Solution {

    public static int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int a:nums){
            if(map.containsKey(a)){
                map.put(a,map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>(map.keySet());
        list.sort((a,b)->{
            if(map.get(a)==map.get(b)){
                return b - a;
            }
            return map.get(a)-map.get(b);
        });
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i:list){
            for(int j:nums){
                if(i==j){
                    list2.add(i);
                }
            }
        }
        int ans[]=new int[list2.size()];
        for(int i=0;i<list2.size();i++){
            ans[i]=list2.get(i);
        }
        return ans;
    }
}