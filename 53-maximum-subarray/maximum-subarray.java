class Solution {
    public int maxSubArray(int[] nums) {
        int sum=Integer.MIN_VALUE;
        int current=0;
        for(int i=0;i<nums.length;i++){
              current+=nums[i];
            sum=Math.max(current,sum);
            if(current<0){
                current=0;
            }
        }
        return sum;
    }
}