class Solution {
    public int maxProduct(int[] nums) {
        int p=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int p1=1;
            for(int j=i;j<nums.length;j++){
                
                
                    p1*=nums[j];
                
                p=Math.max(p,p1);

            }
        }
        return p;
    }
}