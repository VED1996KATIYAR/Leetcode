class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=n*n;
        int sumeven=n*(n+1);
        int gcd=1;
        if(sumodd==0 || sumeven==0){
            return Math.max(sumodd,sumeven);
        }
        for(int i=1;i<=sumodd && i<=sumeven;i++){
            if(sumodd%i==0 && sumeven %i==0){
                gcd=i;
            }
        }
        return gcd;
    }
}