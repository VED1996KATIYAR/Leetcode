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
        
        // Condition 1: All 4 side lengths must be completely equal (arr[0] to arr[3])
        // Condition 2: Both diagonal lengths must be completely equal (arr[4] and arr[5])
        // Condition 3: Side length must be positive (arr[0] > 0) to avoid overlapping points
        return arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3] &&
               arr[4] == arr[5] &&
               arr[0] > 0;
    }
    
    // Computes squared Euclidean distance: (x1 - x2)^2 + (y1 - y2)^2
    private int distance(int[] p, int[] q) {
        return (p[0] - q[0]) * (p[0] - q[0]) + (p[1] - q[1]) * (p[1] - q[1]);
    }
}
