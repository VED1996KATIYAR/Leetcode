import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        String ans=removeOuterParentheses(s);
        System.out.println(ans);
    }
    public static String removeOuterParentheses(String s) {
        String result="";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(count!=0){
                    result+='(';
                }
                count++;
            }else{
                count--;
                if(count!=0){
                    result+=')';
                }
            }
        }
        return result;
    }
}