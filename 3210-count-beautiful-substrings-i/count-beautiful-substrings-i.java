class Solution {
    public int beautifulSubstrings(String s, int k) {
        int count=0;
        for(int i=0;i<s.length();i++){
            int v=0;
            int c=0;
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                    v++;
                }else{
                    c++;
                }
                if((v==c)&&((v*c)%k==0)){
                    count++;
                }
            }
        }
        return count;
    }
}