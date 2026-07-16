class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n];
        int mx[]=new int[n];
        mx[0]=nums[0];
        for(int i=1;i<n;i++){
            mx[i]=Math.max(nums[i],mx[i-1]);
        }
        for(int i=0;i<n;i++){
            prefix[i]=gcd(nums[i],mx[i]);
        }
        Arrays.sort(prefix);
        long sum=0;
        int start=0;
        int end=n-1;
        while(start<end){
            int hcf=gcd(prefix[start],prefix[end]);
            sum+=hcf;
            start++;
            end--;
        }
        return sum;
    }
    public static int gcd(int a, int b)
    {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}