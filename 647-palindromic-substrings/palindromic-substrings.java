class Solution {
    public int countSubstrings(String s) {
        int counter=0;
        for(int i=0;i<s.length();i++){

            for(int j=i;j<s.length();j++){
                String ss=s.substring(i,j+1);
                boolean v=checkit(ss);
                if(v){
                    counter++;
                }

            }
        }
        return counter;
    }
    public static boolean checkit(String ss){
        int start=0;
        int end=ss.length()-1;
        while(start<=end){
            if(ss.charAt(start)!=ss.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}