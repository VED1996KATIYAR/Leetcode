import java.util.HashMap;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int ans=maximumLengthSubstring(s);
        System.out.println(ans);
    }
    public static int maximumLengthSubstring(String s) {
        int l=Integer.MIN_VALUE;
        for (int i = 0; i < s.length(); i++) {
            for(int j=i;j<s.length();j++){
                String s1=s.substring(i,j+1);
                boolean check=two(s1);
                if(check){
                    l=Math.max(l,s1.length());
                }
            }
        }
        return l;
    }
    public static boolean two(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        for(char a:map.keySet()){
            if(map.get(a)>2){
                return false;
            }
        }
        return true;
    }
}