//package leetcode;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        List<Integer> list=new ArrayList<>(luckyNumbers(matrix));
        System.out.println(list);
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            int row_min=Integer.MAX_VALUE;
            for(int j=0;j<matrix[i].length;j++){
                row_min=Math.min(row_min,matrix[i][j]);
            }
            set.add(row_min);
        }
        for(int i=0;i<matrix[0].length;i++){
            int col_max=Integer.MIN_VALUE;
            for(int j=0;j<matrix.length;j++){
                col_max=Math.max(col_max,matrix[j][i]);
            }
            if(set.contains(col_max)){
                list.add(col_max);
            }
        }
        return list;
    }
}
