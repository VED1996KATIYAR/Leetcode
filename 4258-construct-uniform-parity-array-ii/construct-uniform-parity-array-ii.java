class Solution {
    public boolean uniformArray(int[] nums1) {
        int odd=Integer.MAX_VALUE;
        for (int a:nums1){
            if (a%2!=0){
                odd=Math.min(odd,a);
            }
        }
        if(odd==Integer.MAX_VALUE){
            return true;
        }
        for(int a:nums1){
            if (a%2==0 && a<odd){
                return false;
            }
        }
        return true;

    }
}