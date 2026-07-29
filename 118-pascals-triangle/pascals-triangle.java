import java.util.*;
class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numRows=scan.nextInt();
        List<List<Integer>> list=new ArrayList<>(generate(numRows));
        System.out.println(list);
    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>(numRows);
        int dp[][]=new int[numRows][];
        for(int i=1;i<=numRows;i++){
            dp[i-1]=new int[i];
        }
        for(int j=0;j<numRows;j++){
            if(j==0){
                dp[0][0]=1;
            }else{
                dp[j][0]=1;
                int l=dp[j].length-1;
                dp[j][l]=1;
            for(int k=1;k<dp[j].length-1;k++){
                dp[j][k]=dp[j-1][k-1]+dp[j-1][k];
            }}
        }
        for(int i=0;i<dp.length;i++){
            List<Integer> list1=new ArrayList<>();
            for(int j=0;j<dp[i].length;j++){
                list1.add(dp[i][j]);
            }
            list.add(list1);
        }
        return list;
    }
}