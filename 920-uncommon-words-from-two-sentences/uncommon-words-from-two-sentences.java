import java.util.HashMap;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String s11[]=s1.split(" ");
        String s12[]=s2.split(" ");
        HashMap<String,Integer> arr=new HashMap<>();
        for(String a:s11){
            if(arr.containsKey(a)){
                arr.put(a,arr.get(a)+1);
            }else{
                arr.put(a,1);
            }
        }
        for(String b:s12){
            if(arr.containsKey(b)){
                arr.put(b,arr.get(b)+1);
            }else{
                arr.put(b,1);
            }
        }
        List<String> arrr=new ArrayList<>();
        for(String c:arr.keySet()){
            if(arr.get(c)==1){
                arrr.add(c);
            }
        }
        String b[]=new String[arrr.size()];
        for(int i=0;i<arrr.size();i++){
            b[i]=arrr.get(i);
        }
        return b;
    }
}