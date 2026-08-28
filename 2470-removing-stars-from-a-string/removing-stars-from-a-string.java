import java.util.*;
class Solution {
    public String removeStars(String s) {
        Stack<Character> stack1 = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='*'){
                if(!stack1.isEmpty()){
                    stack1.pop();
                }
            }else {
                stack1.push(ch);
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!stack1.isEmpty()){
            sb.append(stack1.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}