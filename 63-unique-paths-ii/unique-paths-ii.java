class Solution {
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int ans[][]=new int[obstacleGrid.length][obstacleGrid[0].length];

        if(obstacleGrid[0][0]==1){
            return 0;
        }
        ans[0][0]=1;
        for (int i = 0; i < obstacleGrid.length; i++) {
            for (int j = 0; j < obstacleGrid[0].length; j++) {
                if(obstacleGrid[i][j]==1){
                    ans[i][j]=0;
                }else if(i==0 && j>0){
                    ans[i][j]=ans[i][j-1];
                }else if(j==0 && i>0){
                    ans[i][j]=ans[i-1][j];
                }
                else if(i>0 && j>0){
                    ans[i][j]=ans[i-1][j]+ans[i][j-1];
                }
            }
        }
        return ans[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
}

