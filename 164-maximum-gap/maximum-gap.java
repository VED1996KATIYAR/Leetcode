class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length==0 ||nums.length==1){
            return 0;
        }
        int max=0;
        int i=0;
        Arrays.sort(nums);
        for(int j=1;j<nums.length;j++){
            int d=nums[j]-nums[i];
            i++;
            max=Math.max(max,d);
        }
        return max;
    }
}