class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int k=0;
        if(nums.length%2!=0){
            k=(nums.length/2)+1;
        }else{
            k=(nums.length/2);
        }
        for(int i=0;i<nums.length;i++){
            int ctr=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    ctr+=1;
                }
            }
            if(ctr>=k){
                return nums[i];
            }else{
                ctr=0;
            }
        }
        return -1;


        // int l=nums.length;
        // int cal=0;
        // if(l%2==0){
        //     cal=l/2;
        // }else{
        //     cal=(l+1)/2;
        // }

        // int number=0;
        // int count=0;
        // for(int i:nums){
        //     if(number==0){
        //         number=i;
        //     }
        //     if(number==i){
        //         count++;
        //     }else{
        //         count--;
        //     }
        // }
        // return number;
        
    }
}