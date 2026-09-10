import java.util.*;
class Solution {
    public int matrixSum(int[][] nums) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j = 0; j < nums[0].length; j++){
                temp.add(nums[i][j]);
            }
            temp.sort(Comparator.reverseOrder());
            list.add(temp);
        }
        int sum = 0;
        for(int j=0;j<list.get(0).size();j++){
            int k1=Integer.MIN_VALUE;
            for(int i=0;i<list.size();i++){
                k1=Math.max(k1,list.get(i).get(j));
            }
            sum+=k1;
        }
        return sum;
    }
}
// list.size()