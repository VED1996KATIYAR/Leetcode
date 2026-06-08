class Solution {
    public int[] searchRange(int[] nums, int target) {
        int v[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                v[0]=i;
                k++;
                break;
            }
        }
        for(int j=nums.length-1;j>=0;j--){
            if(nums[j]==target){
                v[1]=j;
                k++;
                break;
            }
        }
        if(k==0){
            v[0]=-1;
            v[1]=-1;
        }
        return v;
    }
}