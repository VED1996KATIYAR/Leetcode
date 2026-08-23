import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        boolean and=isPalindromic(s);
        System.out.println(and);
    }
    public static boolean isPalindromic(String s) {
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int ans=ch;
            String binary = Integer.toBinaryString(ans);
            
            while (binary.length() < 8) {
                binary = "0" + binary;
            }
            ss.append(binary);
        }
        String one=ss.toString();
        
        
        String two=ss.reverse().toString();
        return one.equals(two);
    }
}