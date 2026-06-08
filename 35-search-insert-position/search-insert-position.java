class Solution {
    public int searchInsert(int[] nums, int target) {
     int k=Arrays.binarySearch(nums,target);
     if(k<0){k=Math.abs(k)-1;}
     return k;   
    }
}