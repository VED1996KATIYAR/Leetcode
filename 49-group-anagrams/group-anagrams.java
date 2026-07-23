class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     int n1=strs.length;
        HashMap<String,List<String>>  map=new HashMap<>();
        for(int i=0;i<n1;i++){
            char ch[]=strs[i].toCharArray();
            Arrays.sort(ch);

            String s1=new String(strs[i]);
            String s2=new String(ch);
            if(map.containsKey(s2)){
                map.get(s2).add(s1);
            }else{
                List<String>list=new ArrayList<>();
                list.add(s1);
                map.put(s2, list);
            }
        }
        List<List<String>> listt=new ArrayList<>();
        for(List<String> group:map.values()){
            listt.add(group);
        }
        return listt;   
    }
}