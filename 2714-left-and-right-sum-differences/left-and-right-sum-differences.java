class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        for(int a:nums){
            sum+=a;
        }
        int leftsum[]=new int[nums.length];
        int rightsum[]=new int[nums.length];
        int arr[]=new int[nums.length];

        int summ=sum;
        for(int i=nums.length-1;i>=0;i--){
            leftsum[i]=summ-nums[i];
            summ-=nums[i];
        }
        
        for(int i=0;i<nums.length;i++){
            rightsum[i]=sum-nums[i];
            sum-=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int diff=leftsum[i]-rightsum[i];
            if(diff<0){
                diff*=-1;
            }
            arr[i]=diff;
        }
        return arr;
    }
}