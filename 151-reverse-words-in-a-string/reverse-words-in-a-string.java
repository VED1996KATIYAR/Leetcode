class Solution {
    public String reverseWords(String s) {
        String a[]=s.trim().split("\\s+");
        String b="";
        for(int i=a.length-1;i>=0;i--){
            
            b+=a[i];
            b+=" ";
        }
        return b.trim();


    }
}