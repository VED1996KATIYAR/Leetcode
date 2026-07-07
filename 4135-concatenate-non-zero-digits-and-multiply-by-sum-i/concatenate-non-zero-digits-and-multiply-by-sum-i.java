class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long v=0;
        String s=String.valueOf(n);
        for(int i=0;i<s.length();i++){
            int b=s.charAt(i)-'0';
            if(b!=0){
                sum+=b;
                v=(v*10)+b;
            }
        }
        return sum *v;
    }
}