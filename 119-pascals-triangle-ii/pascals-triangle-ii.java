import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rowIndex=scan.nextInt();
        List<Integer> list=new ArrayList<>(getRow(rowIndex));
        System.out.println(list);

    }
    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list=new ArrayList<>();
        int dp[][]=new int[rowIndex+1][];
        for(int i=1;i<=rowIndex+1;i++){
            dp[i-1]=new int[i];
        }
        for(int i=0;i<=rowIndex;i++){
            if(i==0){
                dp[i][0]=1;
            }else{
                dp[i][0]=dp[i][i]=1;
                for(int j=1;j<dp[i].length-1;j++){
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
            }
        }
        for(int i=0;i<dp.length;i++){
            List<Integer> temp=new ArrayList<>();
            for(int j=0;j<dp[i].length;j++){
                temp.add(dp[i][j]);
            }
            list.add(temp);
        }
        return list.get(rowIndex);
    }
}