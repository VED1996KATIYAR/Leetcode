// package leetcode;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int ans=largestInteger(n,s);
        System.out.println(ans);
    }
    public static int largestInteger(int n, int s) {
        int max= (int) (Math.pow(10,n)-1);
        while(max>=0){
            int temp=max;
            int sum=0;
            while(temp!=0){
                sum=(sum)+(temp%10);
                temp/=10;
            }
            if(sum==s){
                return max;
            }
            max--;
        }
        return -1;

    }
}