import java.util.*;
public class Solution {
    // public static void main(String[] args) {
    //     Scanner scan = new Scanner(System.in);
    //     int n = scan.nextInt();
    //     int coordinates[][]=new int[n][2];
    //     for(int i=0;i<n;i++)
    //     {
    //         coordinates[i][0]=scan.nextInt();
    //         coordinates[i][1]=scan.nextInt();
    //     }
    //     boolean a=checkStraightLine(coordinates);
    //     if(a)
    //     {
    //         System.out.println("YES");
    //     }
    //     else
    //     {
    //         System.out.println("NO");
    //     }
    // }
    public static boolean checkStraightLine(int[][] coordinates) {
        int x=coordinates[1][0]-coordinates[0][0];
        int y=coordinates[1][1]-coordinates[0][1];
        for(int j=2;j<coordinates.length;j++){
            int x1=coordinates[j][0]-coordinates[0][0];
            int y1=coordinates[j][1]-coordinates[0][1];
            if(y*x1!=x*y1)
            {
                return false;
            }
        }
        return true;
    }
}