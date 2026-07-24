class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        
        int sum=0;
        for(int x:arr){
            sum+=x;
        }
        if(sum%3!=0){
            return false;
        }
        
        int target=sum/3;
        int count=0;
        int sum1=0;
        for(int a:arr){
            sum1+=a;
            if(sum1==target){
                count++;
                sum1=0;
            }
        }
        return count>=3;
    }
}