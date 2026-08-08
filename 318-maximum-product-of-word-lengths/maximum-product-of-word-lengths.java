import  java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String words[]=new String[n];
        for(int i=0;i<n;i++){
            words[i]=input.next();}
        int max1=maxProduct(words);
        System.out.println(max1);
    }
    public static int maxProduct(String[] words) {
        boolean [][] dp=new boolean[words.length][26];
        for(int i=0;i<words.length;i++){
            for(char c:words[i].toCharArray()){
                dp[i][c-'a']=true;
            }
        }
        int max=0;
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(check(dp[i],dp[j])){
                    max=Math.max(max,words[i].length()*words[j].length());
                }
            }
        }
        return max;
    }
    public static boolean check(boolean[] dp,boolean[] dp2){
        for(int i=0;i<26;i++){
            if(dp[i]&&dp2[i]){
                return false;
            }
        }
        return true;
    }
}