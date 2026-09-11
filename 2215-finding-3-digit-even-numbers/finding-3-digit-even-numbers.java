import java.util.*;
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int a:digits){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=100;i<=998;i+=2){
            HashMap<Integer,Integer> map2 = new HashMap<>();
            int temp=i;
            while(temp!=0){
                int mod=temp%10;
                map2.put(mod,map2.getOrDefault(mod,0)+1);
                temp=temp/10;
            }
            boolean check = true;
            for(int key:map2.keySet()){
                Integer one=map.get(key);
                int two=map2.get(key);
                if(one==null){
                    check=false;
                    break;
                }
                if(one<two){
                    check=false;
                    break;
                }
            }
            if(check){
                list.add(i);
            }
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}