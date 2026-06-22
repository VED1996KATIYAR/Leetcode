class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='b'){
                b++;
            }
            if(ch=='a'){
                a++;
            }
            if(ch=='l'){
                l++;
            }
            if(ch=='o'){
                o++;
            }
            if(ch=='n'){
                n++;
            }

        }
        l=l/2;
        o=o/2;
        return Math.min(b,Math.min(a,Math.min(l,Math.min(o,n))));
    }
}