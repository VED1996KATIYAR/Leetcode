class Solution {
    public int countSubstrings(String s) {
        int counter=0;
        for(int i=0;i<s.length();i++){
            String ss="";
            for(int j=i;j<s.length();j++){
                ss=s.substring(i,j+1);

            
            boolean b=checkit(ss);
            if(b){
                counter++;
                }}
                        }
        return counter;
    }
    public static boolean checkit(String s){
        int start=0;
        int end=s.length()-1;
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}