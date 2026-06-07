class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        
        int ll=Math.max(1,n-k);
        int up=n+k;
        int sum=0;
        for(int i=ll;i<=up;i++){
            if(Math.abs(n-i)<=k && (n&i)==0){
                sum+=i;
            }
        }
        return sum;
    }
}

//n-k=1
//n+k=5