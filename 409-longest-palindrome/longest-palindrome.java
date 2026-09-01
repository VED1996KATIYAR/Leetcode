import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int ans=longestPalindrome(s);
        System.out.println(ans);
    }
    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        StringBuilder left=new StringBuilder();
        StringBuilder middle=new StringBuilder();
        StringBuilder right=new StringBuilder();
        for(char ch:map.keySet()){
            int value=map.get(ch);
            int value1=value/2;
            for(int i=1;i<=value1;i++){
                left.append(ch);
            }
            if(value%2==1 && middle.length()==0){
                middle.append(ch);
            }
        }
        right.append(left).reverse();
        return left.length()+middle.length()+right.length();
    }
}