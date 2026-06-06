class Solution {
    public boolean consecutiveSetBits(int n) {
        String bin=Integer.toBinaryString(n);
        if(bin.length()==1){return false;}
        int count=0;
        for(int i=0;i<bin.length()-1;i++){
            char a=bin.charAt(i);
            char b=bin.charAt(i+1);
            if(a==b && a=='1'){
                count++;
            }
        }
        return count==1;
    }
}