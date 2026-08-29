import java.util.*;
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        HashSet<String> dick = new HashSet<>(dictionary);
        String arr[]=sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            String one=arr[i];
            int v=0;
            for(int j=1;j<one.length();j++){
                String ans=one.substring(0,j);
                if(dick.contains(ans)){
                    sb.append(ans);
                    sb.append(" ");
                    v++;
                    break;
                }
            }
            if(v==0){
                sb.append(one);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}