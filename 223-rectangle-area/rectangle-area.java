class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int part1=(ax2-ax1)*(ay2-ay1);
        int part2=(bx2-bx1)*(by2-by1);
        int xstart=Math.max(ax1,bx1);
        int xend=Math.min(ax2,bx2);
        int ystart=Math.max(ay1,by1);
        int yend=Math.min(ay2,by2);
        int width=Math.max(0,xend-xstart);
        int height=Math.max(0,yend-ystart);
        int part3=width*height;
        return part1+part2-part3;
    }
}