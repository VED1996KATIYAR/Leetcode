

import java.util.*;
class Solution {
    
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        HashSet<List<Integer>> set=new HashSet<>();
        ans(0,candidates,target,new ArrayList<>(),list,set);
        List<List<Integer>> result=new ArrayList<>(set);
        return result;
    }

    public static void ans(int index,int [] c,int target,List<Integer> list,List<List<Integer>> result,HashSet<List<Integer>> set){
        if(target==0){
            result.add(new ArrayList<>(list));
            set.add(new ArrayList<>(list));
            return;
        }
        if(target<0||index==c.length){
            return;
        }
        list.add(c[index]);
        ans(index,c,target-c[index],list,result,set);
        list.remove(list.size()-1);
        ans(index+1,c,target,list,result,set);
    }
}