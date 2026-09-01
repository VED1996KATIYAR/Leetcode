import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans=in.nextLine();
        int v=longestPalindrome(ans);
    }
    public static int longestPalindrome(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        StringBuilder left=new StringBuilder();
        StringBuilder middle=new StringBuilder();
        StringBuilder right=new StringBuilder();
        for(char ch:map.keySet()){
            int v=map.get(ch);
            int v1=v/2;
            for (int i=1;i<=v1;i++){
                left.append(ch);
            }
            if(v%2!=0 && middle.length()==0){
                middle.append(ch);
            }
        }
        right.append(left).reverse();

        return right.length()+middle.length()+left.length();
    }
}