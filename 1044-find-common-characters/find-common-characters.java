class Solution {
    public static List<String> commonChars(String[] words) {
        String a=words[0];
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<a.length();i++){
            map.put(a.charAt(i),map.getOrDefault(a.charAt(i),0)+1);
        }
        for(int i=1;i<words.length;i++){
            HashMap<Character,Integer> map1=new HashMap<>();
            String b=words[i];
            for(int j=0;j<b.length();j++){
                map1.put(b.charAt(j),map1.getOrDefault(b.charAt(j),0)+1);
            }
            List<Character> list=new ArrayList<>();
            for(char d:map.keySet()){
                if(map1.get(d)==null){
                    list.add(d);
                }else{
                    map.put(d,Math.min(map.get(d),map1.get(d)));
                }
            }
            for(char ch1:list){
                map.remove(ch1);
            }
        }
        List<String> list=new ArrayList<>();
        for(char ch:map.keySet()){
            int c=map.get(ch);
            for(int i=0;i<c;i++){
                list.add(String.valueOf(ch));
            }
        }
        return list;
    }
}