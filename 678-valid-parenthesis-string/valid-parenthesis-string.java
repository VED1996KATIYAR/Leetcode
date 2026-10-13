import java.util.*;
public class Solution {
    public static boolean checkValidString(String s) {
        Stack<Integer> indexStack = new Stack<>();
        Stack<Integer> astrik = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                indexStack.push(i);
            }else if(s.charAt(i)=='*'){
                astrik.push(i);
            }else{
                if(!indexStack.isEmpty()){
                    indexStack.pop();
                }else if(!astrik.isEmpty()){
                    astrik.pop();
                }else{
                    return false;
                }
            }
        }
        while(!indexStack.isEmpty()){
            if(astrik.isEmpty()){
                return false;
            }int open=indexStack.pop();
            int close=astrik.pop();
            if(open>close){
                return false;
            }
        }
        return indexStack.isEmpty();
    }
}