class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int start=nums[0];
        int end=nums[nums.length-1];
        int hcf=1;
        for(int i=2;i<=start && i<=end;i++){
            if(start%i==0 && end %i==0){
                hcf=i;
            }
        }
        return hcf;
    }
}