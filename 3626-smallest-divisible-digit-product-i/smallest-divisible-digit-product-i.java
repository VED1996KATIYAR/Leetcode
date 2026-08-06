class Solution {
    public int smallestNumber(int n, int t) {
        int temp=0;int sum=1;
        int a=0;
        for(int i=n;;++i){
             temp=i;
            while(temp!=0){
                int mod=temp % 10;
                sum*=mod;
                temp/=10;
            }
            if(sum % t == 0){
                a=i;
                break;
            }else{
                sum=1;
            }
        }return a;
       
    }
}