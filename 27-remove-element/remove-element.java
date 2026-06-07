class Solution {
    public int removeElement(int[] nums, int val) {
        int ctr=0;
        int i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                nums[ctr]=nums[i];
                ctr++;
            }
            i++;

        }
        return ctr;

    }
}