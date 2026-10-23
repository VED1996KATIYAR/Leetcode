class Solution {
    public boolean isPalindrome(String s) {
        if(s==" ") return true;
        s=s.toLowerCase();
        String su="";
        for(int i=0;i<=s.length()-1;i++){
            char a=s.charAt(i);
            int b=a-'0';
            if((a>='a'&&a<='z')||(b>=0 && b<=9)){
                su+=a;
            }
        }
        String ss="";
        for(int j=su.length()-1;j>=0;j--){
            char b=su.charAt(j);
             ss+=(b);
        }
        if(su.equals(ss)) return true;
        return false;
    }
}