class Solution {
    public long[] sumOfThree(long num) {
        if(num%3!=0){
            return new long[0];
        }
        long a=num/3;
        long b=a+1+a+a-1;
        long arr[]=new long[3];
        
        if(b==num){
            arr[0]=a-1;
            arr[1]=a;
            arr[2]=a+1;
            return arr;
        }
        return arr;
    }
}