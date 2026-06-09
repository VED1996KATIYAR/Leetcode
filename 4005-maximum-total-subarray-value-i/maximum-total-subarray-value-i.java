class Solution {
    public long maxTotalValue(int[] nums, int k) {
        long sum=0;
            Arrays.sort(nums);
            long a=nums[0];
            long b=nums[nums.length-1];
            sum+=b-a;
        
        return sum*k;
    }
}

//HintChoose the whole subarray k times.