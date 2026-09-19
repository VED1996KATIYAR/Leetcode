class Solution {
    public boolean checkOverlap(int radius, int xCenter, int yCenter, int x1, int y1, int x2, int y2) {

        int X = Math.max(x1, Math.min(xCenter, x2));
        int Y = Math.max(y1, Math.min(yCenter, y2));

        int X1 = xCenter -X ;
        int Y1 = yCenter -Y;

        return X1 * X1 + Y1 * Y1 <= radius * radius;
    }
}