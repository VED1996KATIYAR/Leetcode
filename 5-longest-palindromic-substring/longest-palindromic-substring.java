import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String p=longestPalindrome(s);
        System.out.println(p);
    }
    public static String longestPalindrome(String s) {
        if(s.length()<2) return s;
        String ans="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String s1=s.substring(i,j+1);
                boolean flag=ispalindrome(s1);
                if(flag){
                    if(ans.length()<s1.length()){
                        ans=s1;
                    }
                }
            }
        }
        return ans;
    }
    public static boolean ispalindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}