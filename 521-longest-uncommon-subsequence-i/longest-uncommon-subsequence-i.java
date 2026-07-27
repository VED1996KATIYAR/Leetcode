import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        int c=findLUSlength(a,b);
        System.out.println(c);
    }
    
    public static int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }

        return Math.max(a.length(), b.length());
    }
    
}
