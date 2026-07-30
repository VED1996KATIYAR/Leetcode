class Solution {
    public static int rangeSum(int nums[],int n,int left,int right){
        ArrayList<Integer> list=new ArrayList<>();
        int mod = 1000000007;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=nums[k];
                }
                list.add(sum);

            }
        }
        Collections.sort(list);
        int sum=0;
        left=left-1;
        right=right-1;
        while(left<=right){
            sum=(sum+list.get(left))%mod;
            left++;
        }
        return sum;
    }
}