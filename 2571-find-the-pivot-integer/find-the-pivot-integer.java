import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int v=pivotInteger(n);
        System.out.println(v);
    }
    public static int pivotInteger(int n) {
        if(n==1){
            return 1;
        }
        for(int i=1;i<=n;i++){
            int sum=0;
            for(int j=1;j<=i;j++){
                sum+=j;
            }
            int sum1=0;
            for(int k=i;k<=n;k++){
                sum1+=k;
            }
            if(sum1==sum){
                return i;
            }
        }
        return -1;
    }
}