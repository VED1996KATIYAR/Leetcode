import java.util.*;
class Solution {
    

    public static int reverseDegree(String s) {
        int count = 26;
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch='a';ch<='z';ch++){
            map.put(ch,count);
            count--;
        }
        for (char ch:map.keySet()) {
            System.out.println(ch +" "+map.get(ch));
        }
        int total=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            total+=map.get(ch)*(i+1);
            
        }
        return total;
    }
}