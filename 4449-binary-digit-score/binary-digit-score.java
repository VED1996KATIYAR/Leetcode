import java.util.*;
class Solution {
    public  static  int calculateScore(int a, int b) {
        String ss1=Integer.toBinaryString(a);
        String ss2=Integer.toBinaryString(b);
        int s1=0;
        int s2=0;
        for (int i=0;i<ss1.length();i++){
            if(ss1.charAt(i)=='1'){
                s1+=1;
            }
        }
        for (int i=0;i<ss2.length();i++){
            if(ss2.charAt(i)=='1'){
                s2+=1;
            }
        }
        if(s1>=s2){
            return s1*s2;
        }
        return s2/s1;
    }
}