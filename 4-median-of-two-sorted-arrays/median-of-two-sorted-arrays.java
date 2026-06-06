class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int k=nums1.length + nums2.length;
        int v[]=new int[k];
        int count=0;
        double median=0.0;
        
        for(int i=0;i<nums1.length;i++){
            v[count]=nums1[i];
            count++;
        }
        for(int j=0;j<nums2.length;j++){
            v[count]=nums2[j];
            count++;
        }
        Arrays.sort(v);
        if(k%2==0){
            
            int a=(k-1)/2;
            int b=((k-1)/2)+1;
            median=(v[a]+(v[b]))/2.0;
        }else{
            
            int s=(k-1)/2;
            median=(v[s]);
        }
        return median;
        
    }
}