class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> arr=new HashSet<>();
            int v=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(!arr.contains(ch)){
                    arr.add(ch);
                }else{
                    break;
                }
            }
            max=Math.max(max,arr.size());
        }
        return max;
    }
}