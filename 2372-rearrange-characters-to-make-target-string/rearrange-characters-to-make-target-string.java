class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer> arrs=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(arrs.containsKey(ch)){
                arrs.put(ch,arrs.get(ch)+1);
            }else{
                arrs.put(ch,1);
            }
        }
        HashMap<Character,Integer> arrt=new HashMap<>();
        for(int j=0;j<target.length();j++){
            char ch=target.charAt(j);
            if(arrt.containsKey(ch)){
                arrt.put(ch,arrt.get(ch)+1);
            }else{
                arrt.put(ch,1);
            }
        }
        int total=Integer.MAX_VALUE;
        for(char ch:arrt.keySet()){
            int t=arrs.getOrDefault(ch,0)/arrt.get(ch);
            total=Math.min(total,t);
        }
        return total;
    }
}

//1- hash map lagao chr