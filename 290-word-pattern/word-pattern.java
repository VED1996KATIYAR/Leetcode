class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String s1[]=s.split(" ");
        if(pattern.length()!=s1.length){
            return false;
        }
        HashMap<Character,String> arr=new HashMap<>();
        HashMap<String,Character> arr1 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch =pattern.charAt(i);
            if(!(arr.containsKey(ch))){
                arr.put(ch,s1[i]);
            }else if (!(arr.get(ch).equals(s1[i]))){
                return false;
            }
            if(!(arr1.containsKey(s1[i]))){
                arr1.put(s1[i],ch);
            }else{
                if(arr1.get(s1[i])!=ch){
                    return false;
                }
            }
        }
        return true;
    }
}