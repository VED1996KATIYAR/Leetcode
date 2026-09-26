import java.util.*;
class Solution {
    public static String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> l: knowledge){
            map.put(l.get(0),l.get(1));
        }
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<s.length()){
            if(s.charAt(i)=='('){
                i++;
                StringBuilder builder = new StringBuilder();
                while(s.charAt(i)!=')'){
                    builder.append(s.charAt(i));
                    i++;
                }
                if(map.containsKey(builder.toString())){
                    sb.append(map.get(builder.toString()));
                }else{
                    sb.append("?");
                }
                i++;
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}