class Solution {
   public  static int minimumDeletions(int[] nums){
        int nums1[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums1[i]=nums[i];
        }
        Arrays.sort(nums1);
        int max=nums1[nums.length-1];
        int one=-1;
        int min=nums1[0];
        int two=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==min){
                two=i;
            }
            if(nums[i]==max){
                one=i;
            }
        }
        int s1=0;
        int maxindex=Math.max(one,two);
        s1=maxindex+1;

        int s2=0;
        int minindex=Math.min(one,two);
        s2=nums.length-minindex;

        int s3=(minindex+1)+(nums.length-maxindex);
        
        return Math.min(s1,Math.min(s2,s3));
    }
}