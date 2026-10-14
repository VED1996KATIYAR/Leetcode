import java.util.*;
class Solution {
    public static String maxSumOfSquares(int num, int sum) {
        if(sum>num*9){
            return "";
        }
        int nine=sum/9;
        int non=sum%9;
        StringBuilder sb=new StringBuilder();
        for (int i=1;i<=nine;i++){
            sb.append('9');
        }
        if(non>0){
            sb.append(Integer.toString(non));
        }
        int num1=num-sb.length();
        for (int i=0;i<num1;i++){
            sb.append('0');
        }
        return sb.toString();
    }
}