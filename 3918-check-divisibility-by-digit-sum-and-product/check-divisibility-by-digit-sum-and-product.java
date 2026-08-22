class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int p=1;
        int n1=n;
        while(n1!=0){
            int mod=n1%10;
            sum+=mod;
            p*=mod;
            n1/=10;
        }
        int ans=p+sum;
        return n%ans==0;
    }
}