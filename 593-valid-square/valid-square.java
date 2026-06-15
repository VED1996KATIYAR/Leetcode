import java.util.Arrays;

class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] arr = new int[6];
        arr[0] = distance(p1, p2);
        arr[1] = distance(p1, p3);
        arr[2] = distance(p1, p4);
        arr[3] = distance(p2, p3);
        arr[4] = distance(p2, p4);
        arr[5] = distance(p3, p4);
        
        Arrays.sort(arr);
        return arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3] &&
               arr[4] == arr[5] &&
               arr[0] > 0;
    }
    

    public static int distance(int[] p, int[] q) {
        return (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
    }
}
