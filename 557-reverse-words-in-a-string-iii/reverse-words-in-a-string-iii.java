import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans=reverseWords(in.nextLine());
        System.out.println(ans);
    }
    public static String reverseWords(String s) {
        String [] words=s.split(" ");
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            sb1.append(sb.reverse());
            sb.setLength(0);
            sb1.append(" ");

        }
        return sb1.toString().trim();
    }
}